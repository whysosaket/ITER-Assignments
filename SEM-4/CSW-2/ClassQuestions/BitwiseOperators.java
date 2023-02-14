public class BitwiseOperators {
    public static void main(String[] args) {
        int n1 = 12, n2 = 25;
        int or, and, xor, not;
        or = n1 | n2;   // This is the bitwise OR operator
        and = n1 & n2;  // This is the bitwise AND operator
        xor = n1 ^ n2;  // This is the bitwise XOR operator
        not = ~n1;  // This is bitwise complement operator
        System.out.println(or);
        System.out.println(and);
        System.out.println(xor);
        System.out.println(not);
    }
}