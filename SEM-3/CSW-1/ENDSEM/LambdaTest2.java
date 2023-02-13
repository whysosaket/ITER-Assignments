package ENDSEM;
public class LambdaTest2 {
    public static void main(String[] args) {
       TestLambda2 t = (x)-> {return x;};
       String s = t.print("Hellow");
       System.out.println(s);

       System.out.println(TestLambda2.a);   //This is final
    }
}

interface TestLambda2{
    public int a=10;
    String print(String print);
    static void m3(){
        System.out.println("Hiii");
    }
}