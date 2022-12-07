import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // T parity of a binary word is 1 if the number of 1s in the word is odd; otherwise, it is 0. Write a program to compute the parity of a very large number of 64-bits.
        long num = sc.nextLong();
        int count = 0;
        while (num > 0) {
            num = num >> 1;
            count++;
        }
        System.out.println(count);
    }
}