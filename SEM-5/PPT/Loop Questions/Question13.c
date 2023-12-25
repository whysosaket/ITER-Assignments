#include <stdio.h>

int numberOfDigits(int n) {
    int count = 0;
    while(n != 0) {
        n /= 10;
        count++;
    }
    return count;
}

int reverseNumber(int n) {
    int rev = 0;
    while(n != 0) {
        rev = rev * 10 + n % 10;
        n /= 10;
    }
    return rev;
}

int isPalindrome(int n) {
    return n == reverseNumber(n);
}

int isArmstrong(int n) {
    int sum = 0, temp = n;
    while(n != 0) {
        int ex = n % 10;
        sum += ex * ex * ex;
        n /= 10;
    }
    return sum == temp;
}

int main() {
    int n = 99;

    do {
        scanf("%d", &n);
    } while (n <= 10);

    int digits = numberOfDigits(n);
    int rev = reverseNumber(n);
    int palindrome = isPalindrome(n);
    int armstrong = isArmstrong(n);

    printf("Number of digits: %d\n", digits);
    printf("Reverse of %d: %d\n", n, rev);
    printf("%d is %s\n", n, palindrome ? "palindrome" : "not palindrome");
    printf("%d is %s\n", n, armstrong ? "armstrong" : "not armstrong");
    
    return 0;
}
