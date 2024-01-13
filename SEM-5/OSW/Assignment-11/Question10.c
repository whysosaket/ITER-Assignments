#include <stdio.h>
#include <stdlib.h>

int main(){
    char str[100];
    printf("Enter the command: ");
    // scanf("%s", str);
    gets(str);
    system(str);
    return 0;
}
