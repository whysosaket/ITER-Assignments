import java.util.HashSet;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        int [] a = {1,1,2,3,4,5,2,2,3,4,3,2,3};
        int ans = returnOdd(a);
        System.out.println(ans);
    }

    private static int returnOdd(int [] a){
        Set<Integer> set = new HashSet<>();
        for(int i: a){
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }
        int ans = set.iterator().next();
        return ans;
    }
}
