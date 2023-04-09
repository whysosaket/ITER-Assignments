import java.util.Stack;


public class Question2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(binaryString(n));
    }

    private static String binaryString(int n){      // O(N) Ans.
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while(n>0){                                 // O(n)
            stack.push(n%2);                        // O(1) 
            n/=2;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
