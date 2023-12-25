#include<stdio.h>

void nFibonacci(int n){
    int a = 1, b = 1, temp;
    printf("\nThe first N fibonacci number are: \n");
    for(int i=1;i<=n;i++){
       printf("%d ",a);
       temp = a+b;
       a = b;
       b = temp;
    }
}

void tillNFibonacci(int n){
    int a = 1, b = 1, temp;
    printf("\nThe fibonacci numbers till N are: \n");
    while(b<=n){
       printf("%d ",b);
       temp = a+b;
       a = b;
       b = temp;
    }
}

int main(){
    int n;
    scanf("%d",&n);
    nFibonacci(n);
    tillNFibonacci(n);
    
    
    return 0;
}