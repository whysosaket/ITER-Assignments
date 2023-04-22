public class Question13 {
    public static void main(String[] args) {
        int [] a = {1,5,666,12};
        minDiff(a);
    }

    private static void minDiff(int [] a){
        int dif = Integer.MAX_VALUE, p1=0,p2=0;
        for(int i=0;i<a.length;i++){
            for (int j = i+1; j < a.length; j++) {
                if(Math.abs(a[i]-a[j])<dif) {
                    dif = Math.abs(a[i]-a[j]);
                    p1=a[i];
                    p2=a[j];
                }
            }
        }
        System.out.printf("The pair with minimum difference is, %d & %d\n", p1,p2);
    }
}
