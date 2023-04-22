import java.util.*;

public class Question10 {
    public static void main(String[] args) {
        Integer [] a = {1,2,3-2,-4,-1};
        List<Integer> list = Arrays.asList(a);
        sumZero(list);
    }

    private static void sumZero(List<Integer> list){
        int sum = Integer.MAX_VALUE,n1=0,n2=0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                int b = list.get(j);
                if((a>0&&b>0)||(a<0&&b<0)) continue;
                if(Math.abs(a+b)<sum) {
                    sum = Math.abs(a+b);
                    n1=a;n2=b;
                }
            }
        }
        System.out.printf("Numbers are, %d and %d\n", n1,n2);
    }
}
