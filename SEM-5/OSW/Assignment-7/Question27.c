#include <stdio.h>

void demo();

int main(){
    void demo();
    void (*fun)();
    fun = demo;
    fun();
    fun();
    return 0;
}

void demo(){
    printf("SS");
}

/*
SSSS
*/