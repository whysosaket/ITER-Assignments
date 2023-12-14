#include <stdio.h>
#include <string.h>

char * trim_blanks(char *trimmed, const char *to_trim)
{
    int n = strlen(to_trim);
    int i = 0, j = 0;
    char *p1 = to_trim;
    while(*p1 ==' '){
        i++;
        p1++;
    }
    j = n-2;
    char *p2 =to_trim;
    while(*(p2+j)==' '){
        j--;
    }
    strncpy(trimmed, p1, j-i+1);
    // trimmed[j-i+1] = '\0';
    return trimmed;
}
int main() {
    char s[] = "     ATL1203S14     ";
    char t[100];
    char *p = trim_blanks(t, s);
    printf("%s\n", p);

    int len = strlen(p);
    printf("%d\n", len);
    return 0;
}
