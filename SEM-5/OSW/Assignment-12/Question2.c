#include<stdio.h>
#include<unistd.h>

int balance = 1000;

void *deposit(int arg){
    int bal = balance;
    sleep(3);
    bal = bal + arg;
    balance = bal;
    printf("Deposited %d\n", arg);
    printf("Balance: %d\n", balance);
    return NULL;
}

void *withdraw(int arg){
    sleep(1);
    int bal = balance;
    bal = bal - arg;
    balance = bal;
    printf("Withdrawn %d\n", arg);
    printf("Balance: %d\n", balance);
    return NULL;
}

int main(int argc, char *argv[]){

    pid_t pid;
    int amount1 = 100, amount2 = 200;

    pid = fork();

    if (pid==0){
        withdraw(amount1);
    }else{
        deposit(amount2);
    }

    return 0;
}
