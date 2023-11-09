#include<stdio.h>

void printArray(int [], int);
void copyDistinct(int [],int [],int);
int check_distinct(int [], int);
int check[10] = {0};

int main(){
    int a[] = {4,7,2,2,5,8,8,8,8,7,3,2,5,5};
    int size_a = sizeof(a)/sizeof(a[0]);
    printArray(a, size_a);
    int size_distinct = check_distinct(a, size_a);
    int distinct[size_distinct];
    copyDistinct(a,distinct,size_a);
    printArray(distinct, size_distinct);
   return 0;
}


void printArray(int a[], int n){
    for (int i = 0; i < n; i++) printf("%d ", a[i]);   
    printf("\n");
}

int check_distinct(int a[], int size){
    int count=0;
    for(int i=0;i<size;i++){
        if(check[a[i]]==0){
            check[a[i]]=1;
            count++;
        }
    }
    return count;
}

void copyDistinct(int a[], int distinct[], int size_a){
    for(int i=0, k=0;i<size_a;i++){
        if(check[a[i]]>=0) {
            distinct[k++]=a[i];
            check[a[i]]=-1;
        }
    }
}