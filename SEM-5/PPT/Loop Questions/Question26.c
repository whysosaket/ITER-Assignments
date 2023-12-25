#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int main(){

    int n;
    scanf("%d",&n);
    int count;
    for(int i=1;i<=n;i++){
        count = 0;
        for(int j=1;j<=i;j++){
            if(j<=i) printf("%d  ", count+=i);
        }
        printf("\n");
    }

    return 0;
}