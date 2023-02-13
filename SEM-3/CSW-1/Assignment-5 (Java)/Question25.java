import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //   Write some program to demonstrate use of auto unboxing.
        int num = sc.nextInt();
        Integer obj = num;
        int num2 = obj;
        System.out.println(num2);
    }
}

