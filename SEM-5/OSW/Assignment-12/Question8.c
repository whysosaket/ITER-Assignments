#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <semaphore.h>

sem_t sem[5];
void display_message(int process_number, const char *message) {
    fprintf(stderr, "P%d: %s\n", process_number, message);
}
void process_code(int process_number, const char *message, 
int semaphore_index) {
    sem_wait(&sem[semaphore_index]);
    display_message(process_number, message);
    sem_post(&sem[semaphore_index + 1]);
}
int main() {
    for (int i = 0; i < 5; ++i) sem_init(&sem[i], 0, 0);
    sem_post(&sem[0]);
    pid_t pid;
    for (int i = 1; i <= 5; ++i) {
        pid = fork();
        if (pid == -1) {
            perror("fork error");
            exit(EXIT_FAILURE);
        } else if (pid == 0) {
            process_code(i, (i == 1) ? "Coronavirus" : (i == 2) 
            ? "WHO:" : (i == 3) ? 
            "COVID-19" : (i == 4) ? "disease" : "pandemic", i - 1);
            exit(EXIT_SUCCESS);
        }
    }
    for (int i = 0; i < 5; ++i) wait(NULL);
    for (int i = 0; i < 5; ++i) sem_destroy(&sem[i]);
    return 0;
}
