#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>

#define BUFFER_SIZE 10
sem_t empty, full, mutex;
int buffer[BUFFER_SIZE];
int in = 0, out = 0;
void *barber(void *arg){
    int i;
    for (i = 0; i < 100; i++){
        sem_wait(&empty);
        sem_wait(&mutex);
        buffer[in] = i;
        printf("Barber: %d\n", buffer[in]);
        in = (in + 1) % BUFFER_SIZE;
        sem_post(&mutex);
        sem_post(&full);}}
void *customer(void *arg){
    int item, i;
    for (i = 0; i < 100; i++){
        sem_wait(&full);
        sem_wait(&mutex);
        item = buffer[out];
        printf("Customer: %d\n", item);
        out = (out + 1) % BUFFER_SIZE;
        sem_post(&mutex);
        sem_post(&empty);}}
int main(){
    pthread_t tid1, tid2;
    sem_init(&empty, 0, BUFFER_SIZE);
    sem_init(&full, 0, 0);
    sem_init(&mutex, 0, 1);
    pthread_create(&tid1, NULL, barber, NULL);
    pthread_create(&tid2, NULL, customer, NULL);
    pthread_join(tid1, NULL);
    pthread_join(tid2, NULL);
    sem_destroy(&empty);
    sem_destroy(&full);
    sem_destroy(&mutex);
    return 0;
}