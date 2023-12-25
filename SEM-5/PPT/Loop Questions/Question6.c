#include<stdio.h>

int main(){
    int n,prd=1;
    scanf("%d",&n);

    for(int i=1;i<=n;i++){
        prd*=i;
    }
    printf("Factorial: %d\n",prd);
    return 0;
}