#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int main(){

    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        for(int j=1;j<2*n;j++){
            if (j<=n-i || j>=n+i)printf("  ");
            else if (j==n-i+1 || j==n+i-1 || i==n) printf("1 ");
            else printf("0 ");
        }
        printf("\n");
    }

    return 0;
}