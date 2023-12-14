#include <stdio.h>
#include <string.h>

int main()
{
    char a1[] = {'S', 'A', 'B', 'C', 'D', 'E'};
    a1[6] = '\0';   // Generate warning but it's okay

    char *p1 = &a1;
    printf("%s\n", p1);

    return 0;
}