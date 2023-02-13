package ENDSEM;
public class LambdaTest {
    public static void main(String[] args) {
       TestLambda t = (x, y)-> {System.out.println(x+y);};
       t.sum(5, 5);
    }
}

interface TestLambda{
    void sum(int x, int y);
}