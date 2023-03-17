public class SequentialSearch {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(search(a, 0));
    }

    private static boolean search(int [] a, int n){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n) return true;
        }
        return false;
    }
}
