#include<stdio.h>

int linear_search(const int [], int , int);

int main(){
    int a[] = {1,21, 33, 45, 45, 61, 71, 72, 73};
    int size = sizeof(a)/sizeof(a[0]);
    int target = 61;
    int index = linear_search(a, size, target);
    if(index==-1) printf("Element not found\n");
    else printf("Index of %d is %d\n", target, index);

   return 0;
}

int linear_search(const int arr[], int size, int target){
    int found = 0, i;
    for(i=0;i<size && !found;i++){
        if(arr[i]==target) found = i+1;
    }
    if(found) return found-1;
    else return -1;
}