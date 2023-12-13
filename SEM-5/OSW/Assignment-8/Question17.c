#include<stdio.h>

int geometricSeq(int n, int a, int r){
    if (n == 1) return a;
    return a + r*geometricSeq(n - 1, a, r);
}

int main(){

    int n, a, r;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("Enter the first term: ");
    scanf("%d", &a);
    printf("Enter the common ratio: ");
    scanf("%d", &r);

    printf("The sum of the geometric sequence is: %d\n", geometricSeq(n, a, r));

    return 0;
}