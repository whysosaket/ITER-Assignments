#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void split(char *str, char *delim){
    char *token = strtok(str, delim);
    int count = 1;
    while(token != NULL){
        printf("%s\n", token);
        token = strtok(NULL, delim);
        count++;
    }
    printf("Number of tokens: %d\n", count);
}

int main(){
    char str[] = "ITER-IBCS-SOA-IDS-SUM-CSE";
    char delim[] = "-";
    split(str, delim);

    char str2[] = "iter ibcs soa ids sum";
    char delim2[] = " ";
    split(str2, delim2);
    return 0;
}