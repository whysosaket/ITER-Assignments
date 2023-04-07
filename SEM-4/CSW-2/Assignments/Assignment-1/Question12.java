public class Question12 {
    public static void main(String[] args) {
        int [] a = {34,8,10,3,2,80,30,33,1};
		int ans = arrayIndexMaxDif(a);
		System.out.println(ans);
    }
    private static int arrayIndexMaxDif(int [] a) {
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
