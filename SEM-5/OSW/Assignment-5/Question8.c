#include<stdio.h>

void newArray(int[], int[],int[], int);
void printArray(int [], int);

int main(){
    int arr1[] = {1,2,3,4,5,6,7};
    int arr2[] = {7,6,5,4,3,2,1};
    int size = sizeof(arr1)/sizeof(arr1[0]);
    int result[size];
    newArray(arr1, arr2, result, size);
    printArray(result, size);
}

void newArray(int a[], int b[],int c[], int size){
    for(int i=0;i<size;i++){
        c[i] = a[i]+b[i]; 
    }
}

void printArray(int a[], int n){
    for (int i = 0; i < n; i++){
        printf("%d ", a[i]);   
    }
    printf("\n");
}