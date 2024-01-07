/*

2. Race conditions are possible in many computer systems. Consider a banking system that maintains an account balance with two functions: deposit(amount) and withdraw(amount). These two functions are passed the amount that is to be deposited or withdrawn from the bank account balance. Assume that a husband and wife share a bank account. Concurrently, the husband calls the withdraw() function and the wife calls deposit(). Describe how a race condition is possible and what might be done to prevent the race condition from occurring. Develop a C code to show the race condition.
*/

#include<stdio.h>
#include<pthread.h>
#include<unistd.h>
#include<stdlib.h>

int balance = 1000;

void *deposit(void *arg){
    int amount = *(int *)arg;
    balance += amount;
    printf("Deposited %d\n", amount);
    printf("Balance: %d\n", balance);
    return NULL;
}

void *withdraw(void *arg){
    int amount = *(int *)arg;
    balance -= amount;
    printf("Withdrawn %d\n", amount);
    printf("Balance: %d\n", balance);
    return NULL;
}

int main(int argc, char *argv[]){

    pthread_t tid1, tid2;
    int amount1 = 100, amount2 = 200;

    pthread_create(&tid1, NULL, deposit, &amount1);
    pthread_create(&tid2, NULL, withdraw, &amount2);

    pthread_join(tid1, NULL);
    pthread_join(tid2, NULL);

    return 0;
}
