public class Question9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,9,7,3,4,};
		int ans = smallestPositiveMissingNumber(a);
		System.out.println(ans);
	}
	
	private static int smallestPositiveMissingNumber(int [] a) {
		int temp;
		for(int i=0;i<a.length;i++) {
			while(a[i]!=i+1 && a[i]>0 && a[i]<a.length) {
				temp = a[i];
				a[i] = a[temp-1];
				a[temp-1] = temp;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=i+1) return i+1;
		}
		return -1;
	}
}
