#include<stdio.h>

int main(){
    int arr[] = {120, 502, 118, 188, 106, 447};
    int *ptr1 = &arr[0], *ptr2 = &arr[1], *ptr3 = &arr[2];
    int *ptr4 = &arr[3], *ptr5 = &arr[4], *ptr6 = &arr[5];
    printf("arr[0]: %d\n", *ptr1);
    printf("arr[1]: %d\n", *ptr2);
    printf("arr[2]: %d\n", *ptr3);
    printf("arr[3]: %d\n", *ptr4);
    printf("arr[4]: %d\n", *ptr5);
    printf("arr[5]: %d\n", *ptr6);
    return 0;
}