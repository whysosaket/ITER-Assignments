#include<stdio.h>

void printBinary(int n){
    if(n == 0){
        printf("0");
        return;
    }
    printBinary(n/2);
    printf("%d", n%2);
}

int main(){

    int n;
    printf("Enter the number: ");
    scanf("%d", &n);
    printBinary(n);

    return 0;
}