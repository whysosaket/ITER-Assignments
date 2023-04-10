import java.util.TreeSet;

public class Question1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);

        // Display the set
        System.out.println(set);

        // Ask user to enter a number and search if the number is present in the set
        int n = 1;
        if(set.contains(n)) {
            System.out.println("The number is present in the set");
        } else {
            System.out.println("The number is not present in the set");
        }

        // Remove element from the tree
        set.remove(2);
        System.out.println(set);
    }
}
