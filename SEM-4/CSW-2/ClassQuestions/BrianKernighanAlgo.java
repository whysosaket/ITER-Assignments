class BrianKernighanAlgo {
    /*
     * By subtracting 1 from integer, an effective
     * observation is that all the bits after the rightmost set bit are flipped
     * including the rightmost set
     * bit.
     */
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        System.out.println("The Integer in Binary: "+Integer.toBinaryString(n));
        while (n>0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }
}