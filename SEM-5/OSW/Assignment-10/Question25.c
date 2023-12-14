#include <stdio.h>
#include <string.h>

int main()
{
    char t2[] = "Merry Christmas";
    char t1[100];
    strncpy(t1, &t2[3], 5);
    t1[5] = '\0';
    printf("%s\n", t1);
    return 0;
}

// Outout: ry Ch