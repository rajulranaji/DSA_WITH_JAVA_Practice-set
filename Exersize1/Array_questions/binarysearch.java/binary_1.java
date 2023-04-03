import java.util.Arrays;
import java.util.*;
public class binary_1{
    public static void main(String[] args) {
        int arr[] = {11,33,44,55,66,77};
        System.out.println("Your Sorted arr is:"+Arrays.toString(arr));
        cal(arr, 0, 0, 0, 0, 0, 0);
    }
    static void cal(int arr[],int start,int end, int mid,int i,int input,int ans){
          Scanner sc = new Scanner(System.in);
          System.out.println("What element do you find?");  
          input = sc.nextInt();
          start = arr[0];
          end = arr.length - 1;
          mid = (start+end)/2;
          for(i=0;i<arr.length;i++){
            if(mid>input){
                end = mid-1;
            }
            else if(mid<input){
                start = mid+1;
            }
            else{
              ans = mid;
            }
          }System.out.println("your element is on:"+ans);
    }
}
