#include <stdio.h>
#include <string.h>

int main()
{
    char a1[] = {'I', 'B', 'C', 'S', '\0'};
    char a2[] = {'S','O', 'A', 'D', 'U'};
    a2[5] = '\0';   // Generate warning but it's okay

    char *p1 = a1;
    char *p2 = a2;

    printf("%s\n", p1);
    printf("%s\n", p2);

    return 0;
}