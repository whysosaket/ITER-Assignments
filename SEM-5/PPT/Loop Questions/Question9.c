#include<stdio.h>

int main(){
    int x,y;
    scanf("%d%d",&x,&y);
    int max, min;
    max = x>y?x:y;
    min = x<y?x:y;

    int gcd, lcm;

    for(int i=min;i>=1;i--){
        if(max%i==0 && min%i==0) {
            gcd = i;
            break;
        }
    }

    lcm = x*y/gcd;
    printf("GCD: %d\nLCM: %d\n", gcd, lcm);
    
    return 0;
}