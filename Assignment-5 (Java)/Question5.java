import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to find the reverse of a string. Use StringBuffer class
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
         
    }
}