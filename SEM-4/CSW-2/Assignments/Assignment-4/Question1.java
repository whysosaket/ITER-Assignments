import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(12);
        list.add(2);
        list.add(1);

        int ans = repeated(list);
        System.out.println(ans);
        
    }

    private static int repeated(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        for(int d: list){
            if(set.contains(d)) return d;
            else set.add(d);
        }
        return -1;
    }
}
