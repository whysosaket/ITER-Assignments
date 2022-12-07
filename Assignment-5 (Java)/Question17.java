import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to delete all duplicate present in a sorted array.
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}