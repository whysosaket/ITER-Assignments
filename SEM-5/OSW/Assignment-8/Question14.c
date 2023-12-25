#include<stdio.h>

void printFibo(int n){
    static int a = 0, b = 1, c=0;
    if(c<n){
        printf("%d, ", a);
        c++;
        int temp = a;
        a = b;
        b = temp + b;
        printFibo(n);
    }
}

int main(){

    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printFibo(n);

    return 0;
}