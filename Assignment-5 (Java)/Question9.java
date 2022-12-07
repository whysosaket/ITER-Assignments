import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program which encode the spreadsheet column.
        //  For example, 1 -> A, 2 -> B, 3 -> C, ..., 26 -> Z, 27 -> AA, 28 -> AB, ...
        int num = sc.nextInt();
        String str = "";
        while (num > 0) {
            int rem = num % 26;
            if (rem == 0) {
                str = "Z" + str;
                num = num / 26 - 1;
            } else {
                str = (char) (rem + 64) + str;
                num = num / 26;
            }
        }
        System.out.println(str);
    }
}