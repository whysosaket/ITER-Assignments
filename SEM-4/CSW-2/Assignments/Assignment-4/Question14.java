public class Question14 {
    public static void main(String[] args) {
        int [] a = {12,55,33};
        int [] b = {99, 44, 911};
        minDiff(a, b);
    }

    private static void minDiff(int [] a, int []b){
        int dif = Integer.MAX_VALUE, p1=0,p2=0;
        for(int i: a){
            for(int j: b){
                if(Math.abs(i-j)<dif){
                    dif = Math.abs(i-j);
                    p1 = i; p2 = j;
                }
            }
        }
        System.out.printf("The pair with minimum difference is, %d & %d\n", p1,p2);
    }
}
