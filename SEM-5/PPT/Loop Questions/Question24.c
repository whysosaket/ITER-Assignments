#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int main(){

    int n;
    scanf("%d",&n);
    int count = 0;
    for(int i=1;i<=n;i++, count++){
        for(int j=1;j<=i+count;j++){
            if(j<=i+count) printf("%d  ", j);
        }
        printf("\n");
    }

    count-=2;
    for(int i=n-1;i>=1;i--, count--){
        for(int j=1;j<=i+count;j++){
            if(j<=i+count) printf("%d  ", j);
        }
        printf("\n");
    }

    return 0;
}