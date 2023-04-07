import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7};
		maxMinArray(a);
		System.out.println(Arrays.toString(a));
	}

	private static void maxMinArray(int [] a) {
		int [] b = new int[a.length];
		for(int i=0;i<a.length;i++) b[i] = a[i];
		int start=0, stop = a.length-1;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i] = b[stop];
				stop--;
			}else {
				a[i] = b[start];
				start++;
			}
		}
		
	}
}
