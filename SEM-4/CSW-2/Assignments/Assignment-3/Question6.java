import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        int [] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        separate(a);
        System.out.println(Arrays.toString(a));
    }

    private static void separate(int[] a) {
        int e = 0;
        int o = a.length - 1;
        while (e < o) {
            while (a[e] % 2 == 0 && e < o) e++;    
            while (a[o] % 2 == 1 && e < o) o--;
            if (e < o) {
                int temp = a[e];
                a[e] = a[o];
                a[o] = temp;
            }
        }
    }   
}
