import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("4");
        list.add("1");
        list.add("1");
        list.add("1");
        removeDuplicates(list);
        System.out.println(list);
    }

    private static void removeDuplicates(List<String> list){
        // Set<Integer> set = new HashSet<>();
        for(int i=0;i<list.size();i++){
            String temp = list.get(i);
            while(list.contains(temp)){
            list.remove(temp);
            }
            list.add(i,temp);
        }
    }
}
