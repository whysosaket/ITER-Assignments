#include <stdio.h>

int main() {
    int n = 99;

    do {
        scanf("%d", &n);
        if(n != 99) printf("%d ", n);
    } while (n != 99);
    printf("\n");

    return 0;
}
