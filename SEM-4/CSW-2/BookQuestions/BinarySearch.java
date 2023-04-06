
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6};
		int index = binarySearch(a, 4);
		System.out.println(index);
	}
	
	private static int binarySearch(int [] a, int n) {
		int low=0, high = a.length-1, mid;
		while(low<=high) {
			mid = low + (high-low)/2;
			if(a[mid]==n) return mid;
			else if(a[mid]<n) low = mid+1;
			else high = mid-1;
		}
		return -1;
	}

}
