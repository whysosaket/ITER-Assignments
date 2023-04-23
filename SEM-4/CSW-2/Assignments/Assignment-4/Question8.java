public class Question8 {
    public static void main(String[] args) {
        int [] a = {1,1,2,3,4,5,2,2,3,4,3,2,2,3};
        returnOdd(a);
    }

    public static void returnOdd(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) x ^= a[i];  
        int r = x & ~(x-1);
        int o1 = 0, o2 = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & r) != 0) o1 ^= a[i]; 
            else o2 ^= a[i];
        }
        System.out.println(o1 + ", " + o2);
    }
    
}
