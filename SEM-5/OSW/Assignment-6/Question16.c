#include<stdio.h>

int main(){
    int a[4], b[4], c[4], d[4];
    a[0] = 10, a[1] = 20, a[2] = 30, a[3] = 40;
    b[0] = 50, b[1] = 60, b[2] = 70, b[3] = 80;
    c[0] = 90, c[1] = 100, c[2] = 110, c[3] = 120;
    d[0] = 130, d[1] = 140, d[2] = 150, d[3] = 160;
    int *arr[4] = {a, b, c, d};
    int sumarr[4] = {0};
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++)
            sumarr[i] += *(*(arr+i)+j);
    }
    for(int i = 0; i < 4; i++)
        printf("Sum of Array %d: %d\n", i+1, sumarr[i]);
    return 0;
}