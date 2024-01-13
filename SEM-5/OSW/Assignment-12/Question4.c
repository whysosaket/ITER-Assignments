#include<stdio.h>
#include<unistd.h>
#include<semaphore.h>

int main(){
    sem_t *sync;
    pid_t pid;
    sync = sem_open("/mysem", O_CREAT, 0644, 0);
    pid=fork();
    if(pid==0){
        sleep(5);
        printf("a\n");
        sem_post(sync);
    }else{
        sem_wait(sync);
        printf("b\n");
    }
    sem_close(sync);
    sem_unlink("/mysem");
}