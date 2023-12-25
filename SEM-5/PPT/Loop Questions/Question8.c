#include<stdio.h>

int main(){
    int n,x;
    scanf("%d%d",&x,&n);
    int px = 1;
    for(int i=0;i<n;i++){
        px*=x;
    }
    printf("Exponent: %d\n",px);
    return 0;
}