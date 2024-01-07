#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <semaphore.h>
#include <fcntl.h>
#include <sys/stat.h>

int main(){
    sem_t *sem;
    sem = sem_open("/mysemaphore", O_CREAT | O_EXCL, S_IRUSR | S_IWUSR, 0);
    if (sem == SEM_FAILED) {
        perror("Semaphore creation failed");
        return 1;
    }
    pid_t pid;
    pid = fork();
    int status;

    if(pid==0){
        sem_wait(sem);
        printf("Child: Executing statement b\n");
        sem_post(sem);
        exit(0);
    }else{
        printf("Parent: Executing statement a\n");
        sem_post(sem);
        pid_t cpid = waitpid(pid, &status, 0);
        printf("Parent: Child %d terminated\n", cpid);
    }
    sem_close(sem);
    sem_unlink("/mysemaphore");
    return 0;
}