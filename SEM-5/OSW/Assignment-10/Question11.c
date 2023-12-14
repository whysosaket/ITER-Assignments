#include <stdio.h>
#include <string.h>

int countchar(char *s){
    int n;
    for(n=0; *s != '\0'; s++){
        n++;
    }
    return n;
}

int main(){
   int n = countchar("Encouraged to Vaccinate");
    printf("%d\n", n);
    return 0;
}

// Output: 23