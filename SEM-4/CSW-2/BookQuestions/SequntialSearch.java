
public class SequntialSearch {

	public static void main(String[] args) {
		int [] a = {1,23,4,56,12};
		int index = seqSearch(a, 56);
		System.out.println(index);
	}
	
	private static int seqSearch(int [] a, int n) {
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) return i;
		}
		return -1;
	}

}
