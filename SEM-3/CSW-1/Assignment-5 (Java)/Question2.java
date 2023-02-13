import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // T parity of a binary word is 1 if the number of 1s in the word is odd;
        // otherwise, it is 0. Write a program to compute the parity of a very large
        // number of 64-bits.
        long x = sc.nextLong();
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;

        System.out.println(x & 0x1);
    }
}