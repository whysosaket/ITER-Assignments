#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main(int argc, char *argv[]){
    char *token;
    char *subtoken;
    char *string, *tofree;
    char *left1, *left2;
    int i = 0;
    for (i = 1, string = argv[1]; ; i++, string = NULL)
    {
        token = strtok_r(string, argv[2], &left1);
        if (token == NULL)
            break;
        printf("Token %d: %s\n", i, token);
        for (tofree = token; ; tofree = NULL)
        {
            subtoken = strtok_r(tofree, argv[3], &left2);
            if (subtoken == NULL)
                break;
            printf("Subtoken: %s\n", subtoken);
        }
    }
    return 0;
}