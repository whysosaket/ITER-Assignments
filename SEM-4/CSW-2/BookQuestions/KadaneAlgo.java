public class KadaneAlgo {
    public static void main(String[] args) {
        int[] a = { -2, -3, 8, -2, -7, 1, 5, -3 };
        System.out.println(maxSum(a));
    }

    private static int maxSum(int [] a){
        int max = Integer.MIN_VALUE, maxHere= 0;
        for (int i = 0; i < a.length; i++) {
            maxHere += a[i];
            if (max < maxHere) max = maxHere;
            if (maxHere < 0) maxHere = 0;
        }
        return max;
    }
}
