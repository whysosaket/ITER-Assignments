public class Count1 {
    public static void main(String[] args) {
        // Write an efficient program to count number of 1s in the binary representation
        // of an integer.
        int n = 7;
        int count1 = method1(n);
        int count2 = method2(n);
        System.out.println(count1);
        System.out.println(count2);
    }

    static int method1(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }

    static int method2(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                count += 1;
            }
            n >>>= 1;
        }
        return count;
    }
}
