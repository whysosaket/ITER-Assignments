#include <stdio.h>
#include <string.h>

void strncpy1(char *s, char *t, int n){
    while(n > 0){
        *s = *t;
        s++;
        t++;
        n--;
    }
}

void strncat1(char *s, char *t, int n){
    int l = strlen(s);
    while(n > 0){
        *(s+l) = *t;
        s++;
        t++;
        n--;
    }
    *(s+l) = '\0';
}

int strncmp1(char *s, char *t, int n){
    while(n > 0){
        if (*s != *t){
            return *s - *t;
        }
        s++;
        t++;
        n--;
    }
    return 0;
}

int main(){
    char s[] = "ASITER";
    char t[] = "ASOA";
    int ans = strncmp1(s, t, 2);
    printf("%d\n", ans);
    return 0;
}