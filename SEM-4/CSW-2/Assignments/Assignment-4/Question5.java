import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);

        int ans = missingElement(list);
        System.out.println(ans);
    }

    private static int missingElement(List<Integer> list){
        for (int i = 1; i < list.size(); i++) if(!list.contains(i+1)) return i+1;
        return -1;
    }
}
