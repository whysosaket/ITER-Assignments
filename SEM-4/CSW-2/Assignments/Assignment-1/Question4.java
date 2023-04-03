
public class Question4 {
    public static void main(String[] args) {
        int [] a = {12,23,24,34,55,79,99};
        int index = binarySearch(a, 99);
        System.out.println(index);
    }   
    
    private static int binarySearch(int [] a, int n){       // O(nlogn)
        int l = 0, h = a.length-1, mid;
        while(l<=h){
            mid = l + (h-l)/2;
            if(a[mid]==n) return mid;
            else if(a[mid]>n) h = mid -1;
            else l = mid+1;
        }
        return -1;
    }
}
