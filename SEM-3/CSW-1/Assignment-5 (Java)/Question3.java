import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Take input of the 64-bit integer number
        long num = sc.nextLong();
        // Take input of the position of the first bit
        int i = sc.nextInt();
        // Take input of the position of the second bit
        int j = sc.nextInt();
        // Create a mask for the first bit
        long mask = 1;
        // Create a mask for the second bit
        long mask1 = 1;
        // Shift the first mask to the i-th position
        mask = mask << i;
        // Shift the second mask to the j-th position
        mask1 = mask1 << j;
        // Extract the value of the i-th bit
        long bit1 = num & mask;
        // Extract the value of the j-th bit
        long bit2 = num & mask1;
        // Swap the i-th bit with the j-th bit
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
        // Output the new value of the 64-bit integer number
        System.out.println(num);
    }
}
