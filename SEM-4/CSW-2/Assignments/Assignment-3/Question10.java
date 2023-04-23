import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Question10 {
    public static void main(String[] args) {
        Integer a [] = { 10, 21, 22, 100, 101, 200, 300 };
        List<Integer> list = new LinkedList(Arrays.asList(a));
        sort(list);
        System.out.println(list);
    }

    private static void sort(List<Integer> list){
        List<Integer> b = new LinkedList<>();
        while(!list.isEmpty()){
            int min = findMin(list);
            b.add(min);
            list.remove(Integer.valueOf(min));
        }
        list.addAll(b);
    }

    private static int findMin(List<Integer> list){
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) if(list.get(i) < min) min = list.get(i);
        return min;
    }

    private static int findMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) if(list.get(i) > max) max = list.get(i);
        return max;
    }

    private static int findMedian(List<Integer> list){
        int [] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) a[i] = list.get(i);
        Arrays.sort(a);
        int mid = a[a.length/2];
        return mid;
    }
}
