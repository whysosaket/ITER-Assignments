#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>

int main(){

    pid_t id = fork();

    if(id){
        while(1){
            printf("Parent Process\n");
        }
    }
    else{
        while(1){
            printf("Child Process\n");
        }
    }

    return 0;
}