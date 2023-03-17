public class BinarySearch {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(a, 12));
    }

    private static int binarySearch(int [] a, int n){
        int low = 0, high = a.length -1, mid;
        while(low<=high){
            mid = low + (high - low)/2;
            if(a[mid]==n) return mid;
            else if(a[mid]>n) high = mid -1;
            else low = mid + 1;
        }
        return -1;
    }
}
