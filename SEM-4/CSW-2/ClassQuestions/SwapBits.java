public class SwapBits {
    public static void main(String[] args) {
        long n = 232;
        System.out.println("Bits are: "+Long.toBinaryString(n));
        n = swapBits(n, 1, 3);
        System.out.println("Bits are: "+Long.toBinaryString(n));
        System.out.println(n);
    }

    static long swapBits(long n, int i, int j){
        if (((n>>>i)&1) != ((n>>>j)&1)){
            long mask = (1L << i)|(1L <<j);
            n ^= mask;
        }
        return n;
    }
}
