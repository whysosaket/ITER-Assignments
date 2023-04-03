
public class Question1 {
    public static void main(String[] args) {
        // Write a progra to check whether a numer is prime or not
        boolean b = isPrime(5);
        System.out.println(b);
    }    

    private static boolean isPrime(int n){
        if (n<=1) return false;                         // O(1)
        if(n==2||n==3) return true;                     // O(1)
        if(n%2==0||n%3==0) return false;                // O(1)

        for(int i=5;i<=Math.sqrt(n);i+=6){              // O(sqrt N)  Ans.
            if(n%i==0||n%(i+2)==0) return false;
        }
        return true;
    }
}
