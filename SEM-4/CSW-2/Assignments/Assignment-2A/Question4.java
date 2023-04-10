import java.util.Stack;

public class Question4 {
    public static void main(String[] args) {
        String s = "5 3 2 * +";
        System.out.println(evaluatePostfix(s));
    }

    public static int evaluatePostfix(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfixExpression.length(); i++) {
            char c = postfixExpression.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                stack.push(num);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = 0;
                switch (c) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }
}
