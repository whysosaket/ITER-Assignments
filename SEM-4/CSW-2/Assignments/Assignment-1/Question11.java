public class Question11 {
    public static void main(String[] args) {
		int a[] = {8,3,1,2};
		int ans = maxCircularSum(a);
		System.out.println(ans);
	}
	
	private static int maxCircularSum(int [] a) {
		int sum = 0, cur=0, max=0;
		
		for(int i=0;i<a.length;i++) {
			sum += a[i];
			cur += a[i]*(i+1);
		}
		max = cur;
		for(int i=1;i<a.length;i++) {
			cur = (cur+sum) - (a.length*a[a.length-1]);
			if(cur>max) max = cur;
		}
		return max;
	}
}
