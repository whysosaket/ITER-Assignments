#include <stdio.h>
#include <string.h>

int main()
{
    int a[10];
    int *pa;
    pa = a; // Leagal
    /*
    (a) pa=a; -> Legal
    (b) pa=&a[0]; -> Legal
    (c) pa++;   -> Legal
    (d) a=pa    -> Illegal
    (e) a++     -> Illegal
    (f) is pa[i] identical to *(pa+i)? -> Yes
    (g) is &a[i] identical to (a+i)? -> Yes
    (h) is a[i] identical to  *(a+i)?   -> Yes
    (i) is pa[i] identical to  a[i]?    -> Yes
    (j) is void f(char str[]){...}identical to void f(char *str){...}?  -> Yes
    (k) If a is an array, is f(&a[2]) identical to f(a+2);  -> Yes
  */
    return 0;
}