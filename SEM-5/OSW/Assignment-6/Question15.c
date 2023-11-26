#include<stdio.h>

int main(){
    int a, b, c, d;
    int *arr[4] = {&a, &b, &c, &d};
    *arr[0] = 55;
    *arr[1] = 105;
    *arr[2] = 89;
    *arr[3] = 68;
    printf("a: %d, b: %d, c: %d, d: %d\n", a, b, c, d);
    int max = *arr[0];
    for(int i = 1; i < 4; i++){
        if(*arr[i] > max) max = *arr[i];
    }
    printf("Max: %d\n", max);
    return 0;
}