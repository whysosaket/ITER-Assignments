
public class Question4 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 6, 1, 5, 6, 1, 3, 9, 11 };
        int val = 5;
        System.out.println("Number of swaps required: " + minSwaps(a, val));
    }



    public static int minSwaps(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                count++;
            }
        }
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] >= k) {
                bad++;
            }
        }
        int ans = bad;
        for (int i = 0, j = count; j < n; i++, j++) {
            if (arr[i] >= k) {
                bad--;
            }
            if (arr[j] >= k) {
                bad++;
            }
            ans = Math.min(ans, bad);
        }
        return ans;
    }

}
