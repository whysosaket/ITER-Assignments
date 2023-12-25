#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int main(){

    int limit;
    scanf("%d",&limit);
    int a,b,c;
    for(int i=1;i<=limit;i++){
        a = i;
        for(int j=i+1;j<=limit;j++){
            b = j;
            for(int k=j+1;k<=limit;k++){
                c = k;
                if (a*a + b*b == c*c) {
                    printf("%d %d %d\n", a,b,c);
                }
            }
        }
    }

    return 0;
}