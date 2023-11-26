#include<stdio.h>

int main(){
    int arr[] = {0,10,20,30,40,50,60,70,80,90};
    int size = sizeof(arr)/sizeof(arr[0]);
    for(int i=0; i<size; i++)
        printf("arr[%d]: %d Address: %p\n", i, arr[i], &arr[i]);
    return 0;
}