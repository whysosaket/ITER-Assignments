#include<stdio.h>

void printArray(int [], int);

int main(){

   return 0;
}

void printArray(int a[], int n){
    for (int i = 0; i < n; i++){
        printf("%d ", a[i]);   
    }
    printf("\n");
}