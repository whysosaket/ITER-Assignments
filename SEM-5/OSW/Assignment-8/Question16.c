#include<stdio.h>

void removeDuplicates(char *str){
    if(str[0] == '\0') return;
    if(str[0] == str[1]){
        int i = 0;
        while(str[i] != '\0'){
            str[i] = str[i+1];
            i++;
        }
        removeDuplicates(str);
    }
    removeDuplicates(str+1);
}

int main(){

    char str[] = "aabccba";
    removeDuplicates(str);
    printf("%s", str);

    return 0;
}