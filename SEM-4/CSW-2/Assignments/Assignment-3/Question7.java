import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] a = {4, 3, 1, 2};
        printNum(a);
    }
    
    public static void printNum(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int count = 0;
        while (count < n) {
            int min = Integer.MAX_VALUE;
            for (int i = count; i < n; i++) if (a[i] > 0 && a[i] < min) min = a[i];
            for (int i = count; i < n; i++) a[i] -= min;
            int left = 0;
            for (int i = count; i < n; i++) if (a[i] > 0) left++;
            System.out.println(left);
            count = n - left;
        }
    }
}
