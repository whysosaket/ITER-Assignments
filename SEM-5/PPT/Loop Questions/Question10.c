#include<stdio.h>

// Check if n is prime or not
int checkPrime(int n){
    int flag=0;
    for(int i=2;i<n;i++){
        if(n%i==0){
            flag=1;
            break;
        }
    }

    if(flag==0) return 1;
    else return 0;
}

// all prime number from 1 to n
void printPrime(int n){
    for(int i=2;i<=n;i++){
        int isPrime=checkPrime(i);
        if (isPrime==1) printf("%d ",i);
    }
    printf("\n");
}

// Check all factors of n
void factors(int n){
    for(int i=1;i<=n;i++){
        if(n%i==0) printf("%d ",i);
    }
    printf("\n");
}

// All Prime Factors of n
void primeFactors(int n){
    for(int i=1;i<=n;i++){
        if(n%i==0){
            int isPrime=checkPrime(i);
            if (isPrime==1) printf("%d ",i);
        }
    }
    printf("\n");
}

int main(){

    int n;
    scanf("%d",&n);

    int isPrime=checkPrime(n);
    if (isPrime==1) printf("Prime\n");
    else printf("Not Prime\n");

    printPrime(n);

    factors(n);

    primeFactors(n);

    return 0;
}