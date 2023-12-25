#include<stdio.h>

void printMultiplicationTable(int n){
    if(n == 0) return;
    for(int i=1;i<=10;i++){
        printf("%d x %d = %d\n",n,i,n*i);
    }
    printf("\n");
}

int main(){

    int n;
    scanf("%d",&n);

    printf("Multiplication Table of %d:\n",n);
    printMultiplicationTable(n);

    for(int i=1;i<=n;i++){
        printf("Multiplication Table of %d:\n",i);
        printMultiplicationTable(i);
    }

    return 0;
}