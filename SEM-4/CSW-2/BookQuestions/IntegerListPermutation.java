
import java.util.Arrays;

public class IntegerListPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3};
		permutation(a,0);
	}
	
	private static void permutation(int [] a, int i) {
		if(a.length==i) {
			System.out.println(Arrays.toString(a));
			return;
		}
		int j=i;
		for(j=i;j<a.length;j++) {
			swap(a,i,j);
			permutation(a,i+1);
			swap(a,i,j);
		}
	}
	
	private static void swap(int[]a, int s,int d) {
		int temp = a[s];
		a[s] = a[d];
		a[d] = temp;
	}

}
