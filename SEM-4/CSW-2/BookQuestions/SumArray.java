
public class SumArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int sum = sumArray(a);
		System.out.println(sum);
	}
	
	private static int sumArray(int [] a) {
		int sum =0;
		for(int i:a) sum+=i;
		return sum;
	}

}
