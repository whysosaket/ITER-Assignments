#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    for (int i = 0; argv[i] != NULL; i++)
    {
        printf("argv[%d]-------- >%d\n", i, argv[i]);
    }
    return 0;
}