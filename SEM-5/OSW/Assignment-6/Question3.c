#include<stdio.h>

int main(){
    float x = 6.7, y = 1.2, z = 2.3;
    float *p;
    p = &x;
    printf("x: %f\n", *p);
    p = &y;
    printf("y: %f\n", *p);
    p = &z;
    printf("z: %f\n", *p);
    return 0;
}