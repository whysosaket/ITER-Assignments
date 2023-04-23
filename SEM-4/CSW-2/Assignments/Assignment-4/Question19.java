import java.util.Arrays;

public class Question19 {
    public static void main(String[] args) {
        int [] a = { 10, 21, 22, 100, 101, 200, 300 };
        int mid = findMid(a);
        System.out.println(mid);
    }

    // find the minimum element in a unsorted array, if it were sorted
    private static int findMid(int [] a){
        int [] b = Arrays.copyOf(a, a.length);
        Arrays.sort(b);
        int mid = b[b.length/2];
        return mid;
    }
}
