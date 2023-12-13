#include<stdio.h>

int sum(int [], int);

int main(){

    int a[5] = {1, 2, 3, 4, 5};
    int n = 5;
    printf("%d\n", sum(a, n-1));
    return 0;
}

int sum(int a[], int n){
    if(n==0) return a[0];
    return a[n] + sum(a, n-1);
}