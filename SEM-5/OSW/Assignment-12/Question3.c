#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <fcntl.h>
#include <sys/stat.h>
#include <unistd.h>

int balance = 1000;
sem_t *sem;

void *deposit_and_withdraw(void *arg) {
    int *amounts = (int *)arg;
    int deposit_amount = amounts[0];
    int withdraw_amount = amounts[1];
    sem_wait(sem);
    balance += deposit_amount;
    printf("Deposited %d\n", deposit_amount);
    printf("Balance after deposit: %d\n", balance);

    balance -= withdraw_amount;
    printf("Withdrawn %d\n", withdraw_amount);
    printf("Balance after withdrawal: %d\n", balance);
    sem_post(sem);
    return NULL;
}

int main() {
    pthread_t tid;
    int amounts[] = {100, 200};
    sem = sem_open("/mysemaphore", O_CREAT | O_EXCL, S_IRUSR | S_IWUSR, 1);
    if (sem == SEM_FAILED) {
        perror("Semaphore creation failed");
        return 1;
    }
    pthread_create(&tid, NULL, deposit_and_withdraw, amounts);
    pthread_join(tid, NULL);
    sem_close(sem);
    sem_unlink("/mysemaphore");
    return 0;
}
