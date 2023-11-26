#include <stdio.h>

int main(){
    int n = 4, m = 3;
    int a[n][m];
    int(*p)[m] = a;
    p = p + 1;
    *p[2] = 100;
    n = p - a;
    printf("%d\n", n);
    printf("%d\n", (*p)[2]);     /*----(B) */
    printf("%d\n", *(*p + 2)); /*----(C) */
    printf("%d\n", *(a[1] + 2)); /*----(D) */
    printf("%d\n", *(*p + 2));   /*----(E) */
    printf("%d\n", *(p[0] + 2)); /*----(F) */
    return 0;
}

/*
2
100
100
100
100
100
*/