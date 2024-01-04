#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*
Incommandlineyouhavetotype./a.out ’CSE/CSIT//EEE/EC//MECH//CIVIL:MBA:MBBS’ ’:’ ’/’arguments.Youarerequiredtowritea’C’codetotokenizethecommand-linearguments.
The first command-line argument(i.e argv[1]) specifies the string to be parsed. The second argu- ment specifies the delimiter byte(s) to be used to separate that string into ”major” tokens. The third argument specifies the delimiter byte(s) to be used to separate the ”major” tokens into subtokens.
Token 1: CSE/CSIT//EEE/EC//MECH//CIVIL Subtoken: CSE CSIT EEE EC MECH CIVIL
         Token 2 MBA
            Subtoken: MBA
         Token 3 MBBS
            Subtoken: MBBS
*/

int main(int argc, char *argv[]){
    char *token;
    char *subtoken;
    char *string, *tofree;
    int i = 0;
    for (i = 1, string = argv[1]; ; i++, string = NULL)
    {
        token = strtok(string, argv[2]);
        if (token == NULL)
            break;
        printf("Token %d: %s\n", i, token);
        for (tofree = token; ; tofree = NULL)
        {
            subtoken = strtok(tofree, argv[3]);
            if (subtoken == NULL)
                break;
            printf("Subtoken: %s\n", subtoken);
        }
    }
    return 0;
}