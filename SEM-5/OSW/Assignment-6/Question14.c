#include <stdio.h>

int main(){
    int m = 25, n = 77;
    char c = '*';
    int *itemp;
    m = &n;
    itemp = m;
    *itemp = c;
    *itemp = &c;
    return 0;
}

/*
for m = &n; error: invalid conversion from ‘int*’ to ‘int’
for itemp = m; error: invalid conversion from ‘int’ to ‘int*’ 
for *itemp = &c; error: invalid conversion from ‘char*’ to ‘int’
*/