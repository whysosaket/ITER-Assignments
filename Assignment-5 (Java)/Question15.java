import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to count how many prime numbers present in an array.
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}