#include<stdio.h>

int main(){
    int a = 12, b = 25, c = 18;
    printf("a: %d, b: %d, c: %d\n", a, b, c);
    int *ptr = &a;
    *ptr+=10;
    ptr = &b;
    *ptr+=10;
    ptr = &c;
    *ptr+=10;
    printf("a: %d, b: %d, c: %d\n", a, b, c);
    return 0;
}