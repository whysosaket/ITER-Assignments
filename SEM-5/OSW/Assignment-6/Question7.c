#include<stdio.h>

int main(){
    int a = 52, b = 18;
    int *ptr1 = &a, *ptr2 = &b;
    if(*ptr1 > *ptr2){
        printf("a: %d is greater than b: %d\n", *ptr1, *ptr2);
    }else{
        printf("b: %d is greater than a: %d\n", *ptr2, *ptr1);
    }
    return 0;
}