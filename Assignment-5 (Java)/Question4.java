import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Compute xXy without arithmetic operator. Use bitwise operator.
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        while (y > 0) {
            int mask = 1;
            int bit = y & mask;
            if (bit == 1) {
                ans = ans + x;
            }
            x = x << 1;
            y = y >> 1;
        }
        System.out.println(ans);       
    }
}