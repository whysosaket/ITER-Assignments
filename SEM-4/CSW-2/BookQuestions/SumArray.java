public class SumArray{
    public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		System.out.println(sumArray(a));
		
	}
	
	private static int sumArray(int [] a) {
		int sum = 0;
		for (int i: a) {
			sum+=i;
		}
		return sum;
	}
}