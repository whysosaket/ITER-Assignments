#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
    char str[100];
    printf("Enter the command: ");
    scanf("%s", str);
    system(str);
    return 0;
}