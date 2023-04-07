public class Question13 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {12,13,18,20,22,26,70};
		int [] b = {11,15,18,19,20,26,30,31};
		int ans = maxPathSum(a,b);
		System.out.println(ans);
	}
	
	private static int maxPathSum(int [] a, int [] b) {
		int i=0, j=0, r=0,s1=0,s2=0;
		while(i<a.length && j< b.length) {
			if(a[i]<b[j]) {
				s1+=a[i];
				i++;
			}else if(a[i]>b[j]) {
				s2+=b[j];
				j++;
			}
			else {
				r+=Math.max(s1, s2);
				r+=a[i];
				s1=0; s2=0;i++;j++;
			}
		}
		
		while(i<a.length) {
			s1+=a[i];
			i++;
		}
		
		while(j<b.length) {
			s2+=b[j];
			j++;
		}
		r+=Math.max(s1,s2);
		return r;
	}
}
