#include<stdio.h>

int main(){

    int m,n;
    scanf("%d%d",&m,&n);

    for(int i=m;i<=n;i++){
        printf("%d ",i);
    }

    printf("\n");

    for(int i=m;i>=n;i--){
        printf("%d ",i);
    }

    return 0;
}