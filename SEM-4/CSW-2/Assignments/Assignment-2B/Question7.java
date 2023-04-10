import java.util.HashSet;
import java.util.Set;

public class Question7 {
    public static void main(String[] args) {
        // Take input of N elements and put in a data structure that no duplicate elements are allowed
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);

        // Display the set
        System.out.println(set);
    }
}
