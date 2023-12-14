#include <stdio.h>

struct person
{
    int ht;
    float wt;
    char color;
    struct person p; /*Line- 5 */
};

int main(){
    return 0;
}

// error: field has incomplete type 'struct person'