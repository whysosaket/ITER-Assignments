import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 1, 5};
        int[] b = {2, 4, 1, 3, 0};
        sort(a, b);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a1, int[] a2) {
        int[] in = new int[a2.length];
        for (int i = 0; i < in.length; i++) {
            in[i] = i;
        }
        
        for (int i = 0; i < a2.length - 1; i++) {
            for (int j = i + 1; j < a2.length; j++) {
                if (a2[in[i]] > a2[in[j]]) {
                    int temp = in[i];
                    in[i] = in[j];
                    in[j] = temp;
                }
            }
        }
        
        int[] temp = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            temp[i] = a1[i];
        }
        
        for (int i = 0; i < in.length; i++) {
            a1[i] = temp[in[i]];
        }
    }
    
    
}
