import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program to swap the ith bit with jth bit of a 64-bits integer number.
        long num = sc.nextLong();
        int i = sc.nextInt();
        int j = sc.nextInt();
        long mask = 1;
        long mask1 = 1;
        mask = mask << i;
        mask1 = mask1 << j;
        long bit1 = num & mask;
        long bit2 = num & mask1;
        if (bit1 == 0) {
            num = num & ~mask1;
        } else {
            num = num | mask1;
        }
        if (bit2 == 0) {
            num = num & ~mask;
        } else {
            num = num | mask;
        }
        System.out.println(num);
        
    }
}