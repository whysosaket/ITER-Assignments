#include <stdio.h>
#include <string.h>

int charcopy(char *s, char *t)
{
    int i = 0;
    while ((*s = *t) != '\0')
    {
        s++;
        t++;
        i++;
    }
    *s = '\0';
    return (i);
}
int main()
{
    char pmsg[60];
    int nc;
    nc = charcopy(pmsg, "Studied in CSE");
    printf("%d...%s\n", nc, pmsg);
    return 0;
}

// Output: 14...Studied in CSE