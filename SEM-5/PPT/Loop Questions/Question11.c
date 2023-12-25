#include <stdio.h>

int main() {
    int max = -1, min = -1, secondMax = -1, secondMin = -1, n;

    do {
        scanf("%d", &n);
        if (n == -1) break;

        if (n > secondMax) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else {
                secondMax = n;
            }
        }

        if (n < secondMin || secondMin == -1) {
            if (n < min || min == -1) {
                secondMin = min;
                min = n;
            } else {
                secondMin = n;
            }
        }

    } while (n != -1);

    printf("Max: %d\nSecond Max: %d\nMin: %d\nSecond Min: %d\n", max, secondMax, min, secondMin);

    return 0;
}
