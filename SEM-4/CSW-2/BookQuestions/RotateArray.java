
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7};
		rotateArray(a,3);
		System.out.println(Arrays.toString(a));

	}
	
	private static void rotateArray(int [] a, int k) {
		reverse(a, 0,k-1);
		reverse(a, k, a.length-1);
		reverse(a, 0, a.length-1);
	}
	
	private static void reverse(int [] a, int start, int end){
		int temp;
		while(start<end){
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

}
