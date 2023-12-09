#include<stdio.h>
void arrange(int *a, int *b){
    if(*a > *b){
        int temp = *a;
        *a = *b;
        *b = temp;
    }
}

void sort(int *a, int *b, int *c, int *d, int *e, int *f){
    for(int i = 0; i < 6; i++){
        arrange(a, b);
        arrange(b, c);
        arrange(c, d);
        arrange(d, e);
        arrange(e, f);
    }
}

int main(){
    int n1, n2, n3, n4, n5, n6;
    printf("Enter SIX numbers seperated by blanks> ");
    scanf("%d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6);
    sort(&n1, &n2, &n3, &n4, &n5, &n6);
    printf("Sorted numbers: %d %d %d %d %d %d\n", n1, n2, n3, n4, n5, n6);
    return 0;
}