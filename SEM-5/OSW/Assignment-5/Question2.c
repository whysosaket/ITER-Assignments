#include<stdio.h>
#define SIZE 6

int main(){

   int square[SIZE],i;

   for(i=0;i<SIZE;i++){
        square[i]=i*i;
    }

    for(i=0;i<SIZE;i++){
        printf("%d, ",square[i]);
    }

    return 0;
}