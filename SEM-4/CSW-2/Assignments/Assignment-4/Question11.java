public class Question11 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        sumValue(a, 5);
    }

    private static void sumValue(int [] a, int val){
        for(int i=0;i<a.length;i++){
            for (int j = i+1; j < a.length; j++) {
                if(val==a[i]+a[j]) {
                    System.out.printf("Values are, %d and %d at indices %d and %d respectively\n", a[i], a[j], i,j);
                    return;
                }
            }
        }
        System.out.println("No such elements found");
    }
}
