import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //   Write some program to demonstrate conversion of object type to base type.
        int num = sc.nextInt();
        Integer obj = new Integer(num);
        int num2 = obj;
        System.out.println(num2);
    }
}

