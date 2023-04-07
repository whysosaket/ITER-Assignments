
public class Question6 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, -2, 5};
        System.out.println(maxSum(a));
    }

    private static int maxSum(int [] a){
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
