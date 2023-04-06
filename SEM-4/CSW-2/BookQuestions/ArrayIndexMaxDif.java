public class ArrayIndexMaxDif {
	
	/// NOTDONE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {34,8,10,3,2,80,30,33,1};
		int ans = arrayIndexMaxDif2(a);
		System.out.println(ans);
	}
	
	private static int arrayIndexMaxDif(int [] a) {
		int [] leftMin = new int[a.length];
		int [] rightMax = new int[a.length];
		leftMin[0] = a[0];
		int i, j, max;
		for(i=1;i<a.length;i++) {
			if(leftMin[i-1]<a[i]) leftMin[i] = leftMin[i-1];
			else leftMin[i] = a[i];
		}
		rightMax[a.length-1] = a[a.length-1];
		for(j=a.length-2;j>=0;j--) {
			if(rightMax[i+1]>a[i]) rightMax[i] = rightMax[i+1];
			else rightMax[i] = a[i];
		}
		i=0;j=0;
		max = -1;
		while(j<a.length&&i<a.length) {
			if(leftMin[i]<rightMax[i]) {
				max = Math.max(max, j-i);
				j++;
			}
			else i++;
		}
		
		return max;
	}
	
	private static int arrayIndexMaxDif2(int [] a) {
		int max = -1,j;
		for(int i=0;i<a.length;i++) {
			j = a.length-1;
			while(j>0) {
				if(a[j]>a[i]) {
					max = Math.max(max, j-i);
					break;
				}
			j--;
			}
		}
		return max;
	}

}
