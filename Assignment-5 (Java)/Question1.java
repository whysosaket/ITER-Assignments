import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Write a program to count number of bits of an integer number. using bitwise operator.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            num = num >> 1;
            count++;
        }
        System.out.println(count);
    }
}