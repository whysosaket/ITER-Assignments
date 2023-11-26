#include<stdio.h>

int main(){
    int arr[] = {120, 502, 118, 188, 106, 447};
    int *ptr = arr;
    int size = sizeof(arr)/sizeof(arr[0]);
    for(int i = 0; i < size; i++){
        printf("arr[%d]: %d\n", i, *ptr);
        ptr++;
    }
    return 0;
}