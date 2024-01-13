#include<stdio.h>
#include<unistd.h>
#include<semaphore.h>

int balance = 1000;
sem_t sema;

void *deposit(int arg){
    int bal = balance;
    sem_wait(sema);
    sleep(3);
    bal = bal + arg;
    balance = bal;
    sem_post(sema);
    printf("Deposited %d\n", arg);
    printf("Balance: %d\n", balance);
    return NULL;
}

void *withdraw(int arg){
    sleep(1);
    int bal = balance;
    sem_wait(sema);
    bal = bal - arg;
    balance = bal;
    sem_post(sema);
    printf("Withdrawn %d\n", arg);
    printf("Balance: %d\n", balance);
    return NULL;
}

int main(int argc, char *argv[]){

    pid_t pid;
    int amount1 = 100, amount2 = 200;
    sema = sem_open("/sema", O_CREAT, 0644, 1);

    pid = fork();

    if (pid==0){
        withdraw(amount1);
    }else{
        deposit(amount2);
    }

    sem_close(sema);
    sem_unlink("/sema");

    return 0;
}
