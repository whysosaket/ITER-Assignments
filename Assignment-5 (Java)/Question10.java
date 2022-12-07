import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program which read a number and base1 and base2 and convert the number of base1 to base2.
        int num = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        int dec = 0;
        int pow = 1;
        while (num > 0) {
            int rem = num % 10;
            dec = dec + rem * pow;
            pow = pow * base1;
            num = num / 10;
        }
        String str = "";
        while (dec > 0) {
            int rem = dec % base2;
            str = rem + str;
            dec = dec / base2;
        }
        System.out.println(str);
    }
}