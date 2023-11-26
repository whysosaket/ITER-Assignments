#include<stdio.h>

int main(){
    int arr1[] = {10,13,20,33,44};
    float arr2[] = {10.2,13.3,20.0,33.3,45.3,89.9};
    int size1 = sizeof(arr1)/sizeof(arr1[0]);
    int size2 = sizeof(arr2)/sizeof(arr2[0]);
    for(int i=0; i<size1; i++)
        printf("arr1[%d]: %d Address: %p\n", i, *(arr1+i), arr1+i);

    printf("\n");

    for(int i=0; i<size2; i++)
        printf("arr2[%d]: %f Address: %p\n", i, *(arr2+i), arr2+i);
    return 0;
}