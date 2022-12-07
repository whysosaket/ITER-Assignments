import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //   Write program to insert an element in an array at specified position.
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int ele = sc.nextInt();
        int[] temp = new int[n + 1];
        for (int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }
        temp[pos] = ele;
        for (int i = pos + 1; i < temp.length; i++) {
            temp[i] = arr[i - 1];
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}