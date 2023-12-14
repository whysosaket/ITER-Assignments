#include <stdio.h>
#include <string.h>
#include <ctype.h>

int is_palindrome(char *c){

    for(int i = 0; i<strlen(c); i++){
        c[i] = tolower(c[i]);
    }

    int i = 0, j = strlen(c)-1;
    while(i<j){
        if(c[i++] != c[j--]) return 0;
    }    
    return 1;
}

int main()
{
    char pres[] = "mAaaam";
    if(is_palindrome(pres)) printf("Palindrome\n");
    else printf("Not Palindrome\n");
    return 0;
}
