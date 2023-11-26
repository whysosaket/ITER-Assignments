#include<stdio.h>

int sum_n_avg(double one, double two, double three, double *sum, double *avg){
    *sum = one + two + three;
    *avg = *sum / 3;
    return 0;
}

int main(){
    double a, b, c, sum, avg;
    printf("Enter three numbers: ");
    scanf("%lf %lf %lf", &a, &b, &c);
    sum_n_avg(a, b, c, &sum, &avg);
    printf("Sum: %lf, Average: %lf\n", sum, avg);
    return 0;
}