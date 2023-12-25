#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int main(){

    int n;
    scanf("%d",&n);
    int a;
    for(int i=1;i<=n;i++){
        a = 1;
        for(int j=1;j<2*n;j++){
            if (j<=n-i || j>=n+i)printf("  ");
            else if (j<n) printf("%d ", a++);
            else printf("%d ", a--);
        }
        printf("\n");
    }

    for(int i=n-1;i>=1;i--){
        a = 1;
        for(int j=1;j<2*n;j++){
            if (j<=n-i || j>=n+i)printf("  ");
            else if (j<n) printf("%d ", a++);
            else printf("%d ", a--);
        }
        printf("\n");
    }

    return 0;
}