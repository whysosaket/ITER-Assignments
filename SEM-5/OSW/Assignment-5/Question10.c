#include<stdio.h>
#include<stdlib.h>

void printArray(int [], int);
void mergeArray(int [], int [], int [], int, int, int);
void generateArray(int [], int);

int main(){
    int a[5], b[10];
    int size_a = sizeof(a)/sizeof(a[0]);
    int size_b = sizeof(b)/sizeof(b[0]);
    int size_c = size_a + size_b;
    int c[size_c];
    generateArray(a,size_a);
    generateArray(b,size_b);

    printArray(a, size_a);
    printArray(b, size_b);

    mergeArray(a, b, c, size_a, size_b, size_c);
    printArray(c, size_c);

   return 0;
}

void mergeArray(int a[], int b[], int c[], int size_a, int size_b, int size_c){
    int i=0, j=0, k=0;
    while(i<size_a && j<size_b){
        if(a[i]<b[j]) c[k++]=a[i++];
        else c[k++]=b[j++];
    }
    while(i<size_a) c[k++]=a[i++];
    while(j<size_b) c[k++]=b[j++];
}

void generateArray(int a[], int size){
    for(int i=0;i<size;i++) a[i]=rand()%100;
}

void printArray(int a[], int n){
    for (int i = 0; i < n; i++) printf("%d ", a[i]);   
    printf("\n");
}