#include <stdio.h>
#include <string.h>

int main()
{
    char c[100];
    scanf("%s", c);
    char *c1 = c;
    while(*c1 != '\0'){
        printf("%c -> %d\n", *c1, c1);
        c1++;
    }
    return 0;
}