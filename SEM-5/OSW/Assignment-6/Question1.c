#include<stdio.h>

int main(){
    int Ia = 345;
    float Fb = 4.5;
    char Chvar = 'Z';
    printf("Ia: %d Address: %p\n", Ia, &Ia);
    printf("Fb: %f Address: %p\n", Fb, &Fb);
    printf("Chvar: %c Address: %p\n", Chvar, &Chvar);
    return 0;
}