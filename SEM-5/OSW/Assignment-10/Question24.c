#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

void bubble_sort(char **c, int n){
    for(int i = 0; i<n-1; i++){
        for(int j = 0; j<n-i-1; j++){
            if(strcmp(c[j], c[j+1]) > 0){
                char *temp = c[j];
                c[j] = c[j+1];
                c[j+1] = temp;
            }
        }
    }
}

int main()
{
    int n;
    printf("Enter the number of strings: ");
    scanf("%d", &n);
    char *c[n];
    for(int i = 0; i<n; i++){
        c[i] = (char *)malloc(100*sizeof(char));
        scanf("%s", c[i]);
    }
    bubble_sort(c, n);
    printf("Sorted strings are:\n");
    for(int i = 0; i<n; i++){
        printf("%s\n", c[i]);
    }
    return 0;
}