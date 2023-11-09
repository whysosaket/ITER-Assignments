#include<stdio.h>

int SimpleFunction(int [], int , int );

int main(){

    int z[10] = {1,1,1,1,1,1,1,1,1};
    int ans = SimpleFunction(z,10,2);

    printf("%d\n", ans);

    return 0;
}

int SimpleFunction(int y[], int n, int x){
      int total=y[0], loopIndex;
      for(loopIndex=1;loopIndex<=n-1;loopIndex++)
         total=x*total+y[loopIndex];
      return total;
}