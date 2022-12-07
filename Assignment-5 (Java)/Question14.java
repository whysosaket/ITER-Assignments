import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to count the frequency of each number present in an array.
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            freq[i] = count;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + freq[i]);
        }
        
    }
}