import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to count the frequency of each digit of a number.
        int num = sc.nextInt();
        int[] arr = new int[10];
        while (num > 0) {
            int rem = num % 10;
            arr[rem]++;
            num = num / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(i + " -> " + arr[i]);
            }
        }
    }
}