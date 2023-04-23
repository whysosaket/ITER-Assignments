import java.util.Arrays;

public class Question17 {
    public static void main(String[] args) {
        int[] a = { 10, 21, 22, 100, 101, 200, 300 };
        int ans = countTriangles(a);
        System.out.println(ans);
    }

    private static int countTriangles(int[] a){
         int n = a.length;
         Arrays.sort(a);
         int count = 0;
         for (int i = n - 1; i >= 1; i--) {
             int l = 0, r = i - 1;
             while (l < r) {
                 if (a[l] + a[r] > a[i]) {
                     count += r - l;
                     r--;
                 }
                 else l++;
             }
         }
         return count;
     }

}
