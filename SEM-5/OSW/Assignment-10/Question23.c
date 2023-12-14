#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char c[100];
    int i = 0;
    char ch;
    while((ch = getchar()) != '\n'){
        c[i++] = ch;
    }
    c[i] = '\0';

    int alphabets = 0, uppercase = 0, lowercase = 0, digits = 0, punctuation = 0, spaces = 0;
    for(int i = 0; i<strlen(c); i++){
        if(isalpha(c[i])){
            alphabets++;
            if(isupper(c[i])) uppercase++;
            else lowercase++;
        }
        else if(isdigit(c[i])) digits++;
        else if(ispunct(c[i])) punctuation++;
        else if(isspace(c[i])) spaces++;
    }

    printf("Alphabets: %d\n", alphabets);
    printf("Uppercase: %d\n", uppercase);
    printf("Lowercase: %d\n", lowercase);
    printf("Digits: %d\n", digits);
    printf("Punctuation: %d\n", punctuation);
    printf("Spaces: %d\n", spaces);

    return 0;
}