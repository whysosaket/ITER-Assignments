

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6};
		int index = binarySearch(a,0,a.length-1, 4);
		System.out.println(index);
	}
	
	private static int binarySearch(int [] a, int l,int h,int v) {
		if(l>h) return -1;
		int mid = l + (h-l)/2;
		if(a[mid]==v) return mid;
		else if(a[mid]>v) return binarySearch(a,l,mid-1,v);
		else return binarySearch(a,mid+1,h,v);
	}

}
