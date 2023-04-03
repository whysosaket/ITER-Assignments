import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        rotateLeft(a, 3);
        System.out.println(Arrays.toString(a));
    }

    private static void rotateLeft(int [] a,int k){
        reverseArray(a, 0, k-1);
        reverseArray(a, k, a.length-1);
        reverseArray(a,0,a.length-1);
    }

    private static void reverseArray(int [] a, int start, int end){
        int temp;
        while(start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
