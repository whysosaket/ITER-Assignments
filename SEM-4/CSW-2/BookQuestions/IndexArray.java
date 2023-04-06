
import java.util.Arrays;

public class IndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {8,-1,6,1,9,3,2,7,4,-1};
		indexArray(a);
		System.out.println(Arrays.toString(a));
	}
	
	private static int indexArray(int [] a) {
		int temp;
		for(int i=0;i<a.length;i++) {
			while(a[i]!=-1 && a[i]!=i) {
				temp = a[i];
				a[i] = a[a[i]];
				a[temp] = temp;
			}
		}
		return -1;
	}

}
