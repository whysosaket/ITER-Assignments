#include<stdio.h>

int binary_srch(int [], int, int);

int main(){

    int a[] = {1,21, 33, 45, 45, 61, 71, 72, 73};
    int size = sizeof(a)/sizeof(a[0]);
    int target = 72;
    int index = -1;
    index = binary_srch(a, size, target);
    if (index==-1) printf("Element not found\n");
    else printf("Index of %d is %d\n", target, index);

   return 0;
}

int binary_srch(int arr[], int size, int target){
    int bottom = 0, top = size-1, middle, index = -1, found = 0;
    while(bottom<=top && !found){
        middle = bottom + (top-bottom)/2;
        if(arr[middle]==target){
            found = 1;
            index = middle;
        }
        else if(arr[middle]>target) top = middle-1;
        else bottom = middle+1;
    }
    return index;
}