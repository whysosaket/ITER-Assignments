/*
The Cigarette-Smokers Problem. Consider a system with three smoker processes and one agent process. Each smoker continuously rolls a cigarette and then smokes it. But to roll and smoke a cigarette, the smoker needs three ingredients: tobacco, paper and matches. One of the smoker processes has paper, another has tobacco, and the third has matches. The agent has an infinite supply of all three materials. The agent places two of the ingredients on the table. The smoker who has the remaining ingredient then makes and smokes a cigarette, signaling the agent on completion. The agent then puts out another two of the three ingredients, and the cycle repeats. Write a program to synchronize the agent and the smokers using any synchronization tool.
*/

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

sem_t tobacco, paper, matches, agent;
void *agent_code(void *arg){
    int i;
    for (i = 0; i < 100; i++){
        sem_wait(&agent);
        sem_post(&tobacco);
        sem_post(&paper);
        sem_post(&matches);
    }
}

void *tobacco_smoker(void *arg){
    int i;
    for (i = 0; i < 100; i++){
        sem_wait(&tobacco);
        printf("Tobacco smoker: %d\n", i);
        sem_post(&agent);
    }
}

void *paper_smoker(void *arg){
    int i;
    for (i = 0; i < 100; i++){
        sem_wait(&paper);
        printf("Paper smoker: %d\n", i);
        sem_post(&agent);
    }
}

void *matches_smoker(void *arg){
    int i;
    for (i = 0; i < 100; i++){
        sem_wait(&matches);
        printf("Matches smoker: %d\n", i);
        sem_post(&agent);
    }
}

int main(){
    pthread_t tid1, tid2, tid3, tid4;
    sem_init(&tobacco, 0, 0);
    sem_init(&paper, 0, 0);
    sem_init(&matches, 0, 0);
    sem_init(&agent, 0, 1);
    pthread_create(&tid1, NULL, agent_code, NULL);
    pthread_create(&tid2, NULL, tobacco_smoker, NULL);
    pthread_create(&tid3, NULL, paper_smoker, NULL);
    pthread_create(&tid4, NULL, matches_smoker, NULL);
    pthread_join(tid1, NULL);
    pthread_join(tid2, NULL);
    pthread_join(tid3, NULL);
    pthread_join(tid4, NULL);
    sem_destroy(&tobacco);
    sem_destroy(&paper);
    sem_destroy(&matches);
    sem_destroy(&agent);
    return 0;
}
