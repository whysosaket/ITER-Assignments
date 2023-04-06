
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans =  gcd(119,120);
		System.out.println(ans);
	}
	
	private static int gcd(int a,int b) {
		if(a<b) return gcd(b,a);
		if(a%b==0) return b;
		return gcd(b, a%b);
	}

}
