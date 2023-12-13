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

void printFibo2(int n, int a, int b, int count) {
    if (count <= n) {
        printf("%d ", a);
        printFibo2(n, b, a + b, count + 1);
    }
}

int main(){

    int n;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    // printFibo(n);
    printFibo2(n, 0, 1, 1);

    return 0;
}