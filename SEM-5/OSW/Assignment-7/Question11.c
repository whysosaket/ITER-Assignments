#include <stdio.h>
#include <stdlib.h>

void fun(int **q);

int main(){
    int *p = (int *)malloc(sizeof(int));
    *p = 55;
    fun(&p);
    printf("P: %d %p\n", *p, p);
    return 0;
}

void fun(int **q){
    int r = 20;
    **q = r;
    printf("Q: %p\n", *q);
}

/*
Q: 0x135e060b0
P: 20 0x135e060b0
*/