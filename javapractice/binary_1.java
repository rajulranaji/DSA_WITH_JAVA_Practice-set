import java.util.Arrays;
import java.util.*;
public class binary_1{
    public static void main(String[] args) {
        int arr[] = {11,33,44,55,66,77};
        System.out.println("Your Sorted arr is:"+Arrays.toString(arr));
        int target = 33;
        int ans = cal(arr,target);
        System.out.println("your ans is"+ans);
    }
    static int cal(int arr[],int target){
          int start = arr[0];
          int end = arr.length - 1;
          while(start>end){
             int  mid = (start+end)/2;
              if(target>arr[mid]){
                start = mid+1;
              }
              if(target<arr[mid]){
                end = mid-1;
              }
              else{
                return mid;
              } 
    }return -1;
}
}

