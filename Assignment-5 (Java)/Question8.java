import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program which reads two integer number of any length from user and find it sum.
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        int sum = 0;
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String ans = "";
        while (i >= 0 || j >= 0) {
            int n1 = 0;
            int n2 = 0;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
            }
            sum = n1 + n2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans = sum + ans;
            i--;
            j--;
        }
        if (carry > 0) {
            ans = carry + ans;
        }
        System.out.println(ans);
    }
}