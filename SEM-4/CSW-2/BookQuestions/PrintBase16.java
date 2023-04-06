
public class PrintBase16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBase16(555);
	}
	
	private static void printBase16(int n) {
		String c = "0123456789ABCDEF";
		int base = 16;
		char digit = (char) (n%base);
		n/=base;
		if(n!=0) printBase16(n);
		System.out.print(c.charAt(digit));
	}

}
