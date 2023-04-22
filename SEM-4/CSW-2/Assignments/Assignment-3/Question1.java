import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        int [] a = {1,1,1,0,1,0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int [] a){
       int i=0, j=a.length-1;
       while(i<j){
         if(a[i]==1){
            if(a[j]!=1){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j--;
         }else i++;
       }
    }
}
