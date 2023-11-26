#include <stdio.h>
#include <stdlib.h>

int main(){
    int i, *p, *rp;
    p = (int *)malloc(5 * sizeof(int));
    // for (i = 0; i < 5; i++)
    //     scanf("%d", p + i); /* 10,20,30,40,50 */
    *p = 10;
    *(p + 1) = 20;
    *(p + 2) = 30;
    *(p + 3) = 40;
    *(p + 4) = 50;
    rp = (int *)realloc(p, 10 * sizeof(int));
    // for (i = 5; i < 10; i++)
    //     scanf("%d", rp + i); /* 9,8,6,5,4 */
    *(rp + 5) = 9;
    *(rp + 6) = 8;
    *(rp + 7) = 6;
    *(rp + 8) = 5;
    *(rp + 9) = 4;
    for (i = 0; i < 10; i++){
        printf("%d...%d\n", rp[i], *(rp + i));
    }
    return 0;
}

/*
10...10
20...20
30...30
40...40
50...50
9...9
8...8
6...6
5...5
4...4
*/