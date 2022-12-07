import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to count number of word present in a string. Use split function
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        System.out.println(arr.length);
    }
}