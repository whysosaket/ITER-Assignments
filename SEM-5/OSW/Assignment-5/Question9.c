#include<stdio.h>

/*
The bubble sort is another technique for sorting an array. A bubble sort compares adjacent array elements and exchanges their values if they are out of order. In this way, the smaller values ”bubble“ to the top of the array (toward element 0), while the larger values sink to the bottom of the array. After the first pass of a bubble sort, the last array element is in the correct position; after the second pass the last two elements are correct, and so on. Thus, after each pass, the unsorted portion of the array contains one less element. Write and test a function that implements this sorting method.
*/

void bubbleSort(int [], int);
void printArray(int [], int);


int main(){
    int arr[] = {10, 8, 9, 7, 6, 3, 5, 4, 2, 1};
    int size = sizeof(arr)/sizeof(arr[0]);
    bubbleSort(arr, size);
    printArray(arr, size);
   return 0;
}

void bubbleSort(int arr[], int size){
    int temp;
    for(int i=0;i<size;i++){
        for(int j=0;j<size-i-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
}

void printArray(int a[], int n){
    for (int i = 0; i < n; i++){
        printf("%d ", a[i]);   
    }
    printf("\n");
}
