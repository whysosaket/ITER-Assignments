import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to rotate an integer array.
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] temp = new int[k];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < arr.length - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = arr.length - k; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - k)];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}