import java.util.Arrays;

public class ArrayWave {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7,8};
		arrayWave(a);
		System.out.println(Arrays.toString(a));
	}
	
	private static void arrayWave(int [] a) {
		for(int i=1;i<a.length;i+=2) {
			if(i-1>=0 && a[i]>a[i-1]) swap(a,i,i-1);
			if(i+1<a.length && a[i]>a[i+1]) swap(a,i,i+1);
		}
	}
	
	private static void swap(int [] a, int s, int l) {
		int temp = a[s];
		a[s] = a[l];
		a[l] = temp;
	}

}
