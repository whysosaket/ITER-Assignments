import java.util.HashSet;
import java.util.Set;

public class Question9 {
    public static void main(String[] args) {
        int[] a1 = {7, 1, 5, 2, 3, 6};
        int[] a2 = {3, 8, 6, 20, 7};

        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int i : a1) {
            union.add(i);
            if (contains(a2, i)) intersection.add(i);
        }
        for (int i : a2) {
            union.add(i);
            if (contains(a1, i)) intersection.add(i);
        }
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    private static boolean contains(int[] a, int n) {
        for (int i : a) {
            if (i == n) return true;
        }
        return false;
    }
}
