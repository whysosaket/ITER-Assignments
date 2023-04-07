

public class Fibonacci {

	public static void main(String[] args) {
		int ans = fibonacci(5);
		System.out.println(ans);
	}
	
	private static int fibonacci(int n) {
		if(n<=1) return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
