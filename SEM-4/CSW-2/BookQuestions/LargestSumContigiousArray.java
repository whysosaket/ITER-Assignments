
public class LargestSumContigiousArray {

	public static void main(String[] args) {
		int [] a = {1,-2,3,4,-4,6,-4,3,2};
		int maxSum = maxSum(a);
		System.out.println(maxSum);

	}
	
	private static int maxSum(int [] a) {
		int max = 0, curr = 0;
		for(int i=0;i<a.length;i++) {
			curr += a[i];
			if(curr<0) curr=0;
		}
		if(max<curr) max=curr;
		return max;
	}

}
