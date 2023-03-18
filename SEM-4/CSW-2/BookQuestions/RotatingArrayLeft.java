import java.util.Arrays;

public class RotatingArrayLeft{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        rotateArray(a, 8);
        System.out.println(Arrays.toString(a));
    }

    private static void rotateArray(int [] a, int k){
        k = k%a.length;
        reverseArray(a, 0, k - 1);
        reverseArray(a, k, a.length - 1);
        reverseArray(a, 0, a.length - 1);
    }

    private static void reverseArray(int [] a, int s, int l){
        int temp;
        for (int i = s, j=l; i < j; i++, j--) {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
    }
}