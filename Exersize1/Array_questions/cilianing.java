// import java.security.Key;
import java.util.Arrays;

public class cilianing {
    public static void main(String[] args) {
        int arr []= {2,4,6,8,10};
        System.out.println("Your arr is:"+Arrays.toString(arr));
        int tartget = 5;
       int ans = func(arr, tartget);
       System.out.println(ans);
    }
    static int func(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key>arr[mid]){
                start = mid+1;
            }
            else if(key<arr[mid]){
                end = mid-1;
            }
            else{
                 return mid;
                }
            }
            return start;
        }
}

