#include<stdio.h>

int main(){
    int x = 89;
    int *p1, *p2, *p3;
    p1 = p2 = p3 = &x;
    printf("x: %d\n", *p1);
    *p3 = 100;
    printf("x: %d\n", *p1);
    return 0;
}