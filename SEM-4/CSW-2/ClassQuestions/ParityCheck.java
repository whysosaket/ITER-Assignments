public class ParityCheck {
    /*
     * Parity of a number refers to whether it contains an odd or even number of
     * 1-bits.
     * The number has “odd parity”, if it contains odd number of 1-bits and is “even
     * parity”
     * if it contains even number of 1-bits.
     * 
     * Approach for checking parity of a number:
     * 1. Brute Force Method -> Check all bits one by one
     * 2. Use Brian Kernighan’s Algorithm to reduce number of steps
     * 3. Use Lookup Table to reduce number of steps (Also known as caching)
     */
    public static void main(String[] args) {
        int n = 25;
        System.out.println("The number in Binary is: " + Integer.toBinaryString(n));
        System.out.println(parityCount(n));
        System.out.println(parityCount2(n));
        System.out.println(parityCount3(n));
        System.out.println(parityCount4(n));
    }

    static int parityCount(int n) {
        // Using Brute Force Approach
        int count = 0;
        while (n != 0) {
            count ^= ((n & 1) == 1) ? 1 : 0;
            n >>>= 1;
        }
        return count;
    }

    static short parityCount2(int n) {
        // Using Brian Kernighan's Algo
        short count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count ^= 1;
        }
        return count;
    }

    static short parityCount3(int n) {
        // Using Caching
        final int W0RD_SIZE = 2;
        final int BIT_MASK = 3; // 00000011 (in Binary)
        int precomputedParity[] = { 0, 1, 1, 0 };
        return (short) (precomputedParity[(int) ((n >>> (3 * W0RD_SIZE)) & BIT_MASK)]
                ^ precomputedParity[(int) ((n >>> (2 * W0RD_SIZE)) & BIT_MASK)]
                ^ precomputedParity[(int) ((n >>> W0RD_SIZE) & BIT_MASK)]
                ^ precomputedParity[(int) (n & BIT_MASK)]);

    }

    static short parityCount4(long n) {
        n ^= n >>> 32;
        n ^= n >>> 16;
        n ^= n >>> 8;
        n ^= n >>> 4;
        n ^= n >>> 2;
        n ^= n >>> 1;
        return (short) (n & 0x1); // means 1

    }

}
