import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //   Create a class Num having an integer array as its member and required set, get and constructor. Add a method to Num class which find the reverse of the array.
        int n = sc.nextInt();
        Num[] arr = new Num[n];
        for (int i = 0; i < arr.length; i++) {
            int[] temp = new int[n];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = sc.nextInt();
            }
            arr[i] = new Num(temp);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].reverse();
        }

    }
}

class Num {
    int[] arr;
    public Num(int[] arr) {
        this.arr = arr;
    }
    public void reverse() {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}