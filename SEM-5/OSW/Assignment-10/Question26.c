#include <stdio.h>
#include <string.h>

int main()
{

    char x[80] = "gorilla";
    char y[80] = "giraffe";
    strcpy(x, y);
    printf("%s %s\n", x, y);
    return 0;
}

// Outout: giraffe giraffe