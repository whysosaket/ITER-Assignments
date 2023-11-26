#include <stdio.h>

int tob(int b, int *arr){
    int i;
    for (i = 0; b > 0; i++){
        if (b % 2) arr[i] = 1;
        else arr[i] = 0;
        b = b / 2;
    }
    return (i);
}

int pp(int a, int b){
    int arr[20];
    int i, tot = 1, ex, len;
    ex = a;
    len = tob(b, arr);
    for (i = 0; i < len; i++){
        if (arr[i] == 1){
            tot = tot * ex;
            ex = ex * ex;
            break;
        }
    }
    printf("TOT: %d\n", tot);
    printf("EX: %d\n", ex);
    printf("LEN: %d\n", len);
    for (i = 0; i < len; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
    return tot;
}

int main(){
    int a = pp(3, 4);
    printf("%d\n", a);
    return 0;
}

/*
TOT: 3
EX: 9
LEN: 3
Array Content: 0 0 1 
3
*/