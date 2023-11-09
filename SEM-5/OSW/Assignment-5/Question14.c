#include<stdio.h>

void printArray(int [], int);
void isValid(int [], int);

int main(){
    int barcode[12];
    printf("Enter the barcode: ");
    for(int i=0;i<12;i++) scanf("%d", &barcode[i]);
    isValid(barcode, 12);
   return 0;
}

void printArray(int a[], int n){
    for (int i = 0; i < n; i++) printf("%d ", a[i]);   
    printf("\n");
}

void isValid(int a[], int size){
    int sumOdd=0, sumEven=0;
    for(int i=0;i<size-1;i++){
        if(i%2==0) sumOdd+=a[i];
        else sumEven+=a[i];
    }
    int checkDigit = 10 - (sumOdd*3+sumEven)%10;
    if(checkDigit==a[size-1]) printf("Validated\n");
    else printf("Error in barcode\n");
}