#include<stdio.h>

void reverse_input_words(int n){
    if (n==0) return;
    int ex = n%10;
    printf("%d", ex);
    reverse_input_words(n/10);
}

int main(){
    int n = 1234;
    reverse_input_words(n);
    return 0;
}