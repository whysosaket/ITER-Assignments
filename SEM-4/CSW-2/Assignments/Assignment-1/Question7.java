import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int [] a = {1,4,3,2,5,6,7,8,9,10};
        waveForm(a);
        System.out.println(Arrays.toString(a));
    }

    private static void waveForm(int [] a){
        int temp;
        for(int i=1;i<a.length;i++){
            if(i%2==0){
                if(a[i]>a[i-1]){
                    temp=a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                }
            }
            else{
                if(a[i]<a[i-1]){
                    temp=a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                }
            }
        }
    }
}
