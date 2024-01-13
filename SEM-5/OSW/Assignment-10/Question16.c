#include <stdio.h>
#include <string.h>

void stringconcate(char *s, char *t){
    char *p = s;
    int n = strlen(s);
    while(*t != '\0'){
        *(p+n) = *t;
        p++;
        t++;
    }
    *(p+n) = '\0';
}

int main(){
    char s[] = "ITER";
    char t[] = "SOA";
    stringconcate(s, t);
    printf("%s\n", s);
    return 0;
}