
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = factorial(5);
		System.out.println(a);
	}
	
	private static int factorial(int n) {
		if(n<=1) return 1;
		return n*factorial(n-1);
	}

}
