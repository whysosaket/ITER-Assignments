#include<stdio.h>

int main(){
    char *arg[5];
    char a[5] = {'m', 'i', 'n', 'e', '\0'};
    char b[3] = {'c', 's', '\0'};
    char c[3] = {'s', 'c', '\0'};
    char d[4] = {'s', 'o', 'a', '\0'};
    char e[4] = {'\0'};
    arg[0] = a, arg[1] = b, arg[2] = c;
    arg[3] = d, arg[4] = e;

    for(int i = 0; i < 5; i++){
        for(int j = 0; arg[i][j] != '\0'; j++){
            if(arg[i][j] >= 'a' 
                && arg[i][j] <= 'z'){
                    arg[i][j] -= 32;
                }
                
        }
    }

    for(int i = 0; i < 5; i++){
        printf("%s\n", arg[i]);
    }
    return 0;
}




