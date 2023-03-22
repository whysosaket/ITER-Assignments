import java.util.Arrays;

public class Wave {
    public static void main(String[] args) {
        int [] a = {1,3,3,4,12,6,7,8,9};
        Wave(a);
        System.out.println(Arrays.toString(a));
    }

    public static void Wave(int arr[], int n){
        for(int i = 0; i < n-1; i+=2){
            if(i > 0 && arr[i - 1] > arr[i]) swap(arr, i, i-1);
            if(i < n-1 && arr[i + 1] > arr[i]) swap(arr, i, i+1);
        }
    }


    public static  void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
