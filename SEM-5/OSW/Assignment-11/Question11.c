#include <stdio.h>
#include <string.h>
#include <stdlib.h>

extern char **environ;

int main(){

    for (int i = 0; environ[i] != NULL; i++)
    {
        printf("environ[%d]-------- >%s\n", i, environ[i]);
    }

    return 0;
}