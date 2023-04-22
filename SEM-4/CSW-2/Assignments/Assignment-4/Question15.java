import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        int a[] = { 0, -1, 2, -3, 1 };
        findTriplets(a);
    }

    private static void findTriplets(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = i + 1; j < a.length; j++) {
                int x = -(a[i] + a[j]);
                if (s.contains(x)) {
                    System.out.printf("%d %d %d\n", x, a[i], a[j]);
                    return;
                }
                else s.add(a[j]);
            }
        }
        System.out.println("Triplet not found");
    }
}
