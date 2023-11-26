#include<stdio.h>

int main(){
    char *arg[5];
    char a[5] = {'M', 'I', 'N', 'E', '\0'};
    char b[3] = {'C', 'S', '\0'};
    char c[3] = {'S', 'C', '\0'};
    char d[4] = {'S', 'O', 'A', '\0'};
    char e[4] = {'\0'};
    arg[0] = a, arg[1] = b, arg[2] = c, arg[3] = d, arg[4] = e;
    for(int i = 0; i < 5; i++){
        printf("%s\n", arg[i]);
    }
    return 0;
}