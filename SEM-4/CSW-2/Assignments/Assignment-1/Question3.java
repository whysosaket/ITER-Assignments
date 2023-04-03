
public class Question3 {
    public static void main(String[] args) {
        int n = 12312;
        System.out.println(reverseNumber(n));
    }

    private static int reverseNumber(int n){
        if (n<0)  n = -n;
        int ans = 0;
        int r;
        while(n>0){                 // O(log10 N)
            r = n%10;
            ans = ans*10 + r;
            n/=10;
        }
        return ans;
    }
}
