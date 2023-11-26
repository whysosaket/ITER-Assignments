#include<stdio.h>

int main(){
    int a = 10, b = 20;
    printf("a: %d Address: %p\n", a, &a);
    printf("b: %d Address: %p\n", b, &b);
    int temp = a;
    a = b;
    b = temp;
    printf("a: %d Address: %p\n", a, &a);
    printf("b: %d Address: %p\n", b, &b);
    return 0;
}