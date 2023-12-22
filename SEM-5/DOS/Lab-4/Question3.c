#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>

int main(){

    pid_t id = fork();
    if(id == 0){
        execlp("cp", "cp", "file1", "file2", NULL);
        printf("\n");
        _exit(0);
    }
    else{
        sleep(1);
        id = fork();

        if(id==0){
            execlp("cat", "cat", "file2", NULL);
            printf("\n");
            _exit(0);
        }
        else{
            sleep(1);
            id = fork();
            if(id==0){
                execlp("tac", "tac", "file2", NULL);
                printf("\n");
                _exit(0);
            }
            else{
                sleep(1);
                printf("Parent process ID: %d\n", getpid());
                printf("All child processes have completed execution\n");
            }
        }
       
    }

    return 0;
}