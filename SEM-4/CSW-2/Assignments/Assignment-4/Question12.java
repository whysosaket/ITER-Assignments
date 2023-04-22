import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,5};
        Integer [] b = {3,5,6};
        List<Integer> l1 = Arrays.asList(a);
        List<Integer> l2 = Arrays.asList(b);

        findPair(l1, l2, 10);
    }

    private static void findPair(List<Integer> l1, List<Integer> l2, int val){
        for(int i1: l1){
            for(int i2: l2){
                if(i1+i2==val){
                    System.out.printf("The pairs are, %d and %d\n", i1, i2);
                    return;
                }
            }
        }
        System.out.println("No such pairs found");
    }
}
