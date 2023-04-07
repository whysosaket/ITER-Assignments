import java.util.Arrays;

public class Sort1toN {

	public static void main(String[] args) {
		int [] a = {1,4,3,2};
		sort1toN(a);
		System.out.println(Arrays.toString(a));
	}
	
	private static void sort1toN(int [] a) {
		int temp;
		for(int i=0;i<a.length;i++) {
			while(a[i]!=i+1 && a[i]>1) {
				temp = a[i];
				a[i] = a[temp - 1];
				a[temp - 1] = temp;
			}
		}
	}

}
