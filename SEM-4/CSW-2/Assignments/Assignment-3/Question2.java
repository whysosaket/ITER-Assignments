import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int [] a = {1,2,1,2,1,0,0,0,1,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int [] a){
        int i = 0, j = a.length-1, m = 0, t=0;

        while(m<=j){
            switch(a[m]){
                case 0 -> {
                    t = a[i];
                    a[i] = a[m];
                    a[m] = t;
                    i++; m++;
                }
                case 1 -> m++;
                case 2 -> {
                    t = a[m];
                    a[m] = a[j];
                    a[j] = t;
                    j--;
                }
            }
        }

    }
}
