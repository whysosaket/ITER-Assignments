#include<stdio.h>

int main(){
    int n;
    printf("Enter the length of the Fibonacci series: ");
    scanf("%d", &n);
    int arr[n];
    pid_t id = fork();
    if(id == 0){
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        printf("Child process ID: %d\n", getpid());
        printf("Fibonacci series: ");
        for(int i=0; i<n; i++){
            printf("%d ", arr[i]);
        }
        printf("\n");
    }
    else{
        wait(NULL);
        printf("Parent process ID: %d\n", getpid());
        printf("All child processes have completed execution\n");
        int flag = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 2){
                printf("Prime Fibonacci number: %d\n", arr[i]);
                printf("Position: %d\n", i+1);
                flag = 1;
                break;
            }
            else if(arr[i] % 2 == 0){
                continue;
            }
            else{
                int j;
                for(j=3; j*j<=arr[i]; j+=2){
                    if(arr[i] % j == 0){
                        break;
                    }
                }
                if(j*j > arr[i]){
                    printf("Prime Fibonacci number: %d\n", arr[i]);
                    printf("Position: %d\n", i+1);
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            printf("No prime Fibonacci number found\n");
        }
    }
    return 0;
}