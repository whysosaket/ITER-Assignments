import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //   Write some program to demonstrate use of valuOf method.
        int num = sc.nextInt();
        Integer obj = Integer.valueOf(num);
        System.out.println(obj);
    }
}

