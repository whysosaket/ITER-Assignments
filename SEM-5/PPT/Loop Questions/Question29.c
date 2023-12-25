#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int main(){

    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(j>1 && j<=i) printf(" * ");
            if (i%2==0) printf("%d",(i*(i+1))/2-j+1);
            else printf("%d",(i*(i-1))/2+j);
        }
        printf("\n");
    }

    return 0;
}