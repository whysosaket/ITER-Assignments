import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(decimalToBinary(n));
    }

    private static String decimalToBinary(int n) {
        
        Stack<Integer> stack = new Stack<Integer>();
        while(n>0) {
            stack.push(n%2);
            n = n/2;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
