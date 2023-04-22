import java.util.*;

public class Question9 {
    public static void main(String[] args) {
        int [] a = {1,2,3,1,2,3};
        int ans = sumDistinct(a);
        System.out.println(ans);
    }

    private static int sumDistinct(int [] a){
        int sum =0;
        Set<Integer> set = new HashSet<>();
        for(int i: a){
            if(set.contains(i)) continue;
            sum+=i;
            set.add(i);
        }
        return sum;
    }
}
