import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        int [] a = {1,2,6,3,1,2,7};
        findMinMax(a);
    }

    private static void findMinMax(int [] a){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min) min = a[i];
            else if(a[i]>max) max = a[i];
            set.add(a[i]);
        }
        System.out.printf("The max number is, %d and min number is %d\n", max,min);
        System.out.print("Missing Elements in Min, Max range are: ");
        for (int i = min+1; i < max; i++) {
            if(!set.contains(i)) System.out.print(i+", ");
        }
        System.out.println();
    }
}
