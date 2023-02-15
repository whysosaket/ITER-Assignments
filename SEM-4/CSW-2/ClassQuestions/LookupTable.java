public class LookupTable {
    /*
     * This is a lookup table based approach
     * The idea is to use a lookup table to store the number of set bits in each
     * number from 0 to 15
     * and then use the table to count the number of set bits in the given number
     * 
     * We can even use a looktable of any size say 0 to 7 and then use the table to
     * count the number of set bits in the given number
     * In that case, n >>> 3 will be used instead of n >>> 4
     * and we well use 0x07 instead of 0x0f
     */
    public static void main(String[] args) {
        int n = 31;
        System.out.println("The Integer in Bianry is: " + Integer.toBinaryString(n));
        System.out.println("The number of set bits is: " + countBits(n));
    }

    public static short countBits(int n) {
        short count = 0;
        int[] table = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
        while (n > 0) {
            count += table[n & 0x0f]; // 0x0f means 0000 1111
            n = n >>> 4;
        }
        return count;
    }
}
