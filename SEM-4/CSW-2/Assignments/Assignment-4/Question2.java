import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,2,3,5};
        duplicate(a);
    }

    private static void duplicate(int [] a){
       Set<Integer> set = new HashSet<>();
        for(int i: a){
            if(set.contains(i)) System.out.println(i);
            else set.add(i);
        }
    }
}
