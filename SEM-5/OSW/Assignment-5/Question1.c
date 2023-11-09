#include<stdio.h>

int main(){
    int prime_lt_100[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,41, 43, 47, 53, 59,
          61, 67, 71, 73, 79, 83, 89, 97};

    int a = prime_lt_100[24];
    
    int i=10;
    int b = prime_lt_100[i+4];

    int c = prime_lt_100[prime_lt_100[2] +  prime_lt_100[0]];

    prime_lt_100[6]=prime_lt_100[6] +  prime_lt_100[16];
    int d = prime_lt_100[6];

    printf("%d %d %d %d\n",a,b,c,d);
    return 0;
}