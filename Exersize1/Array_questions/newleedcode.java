import java.util.*;
public class newleedcode {
    public static void main(String[] args) {
       take(0, 0, 0, 0, 0);
    }
    public static void take(int num1, int num2,int target, int i,int len){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter here the array elements:");
        int [] arr = new int [5];
        len = arr.length;
        target = arr[0];
        for( i=1;i<5;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Your array elements is:");
        for(i=1;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Your largest NO is:");
        for(i=1;i<len;i++){
        if(arr[i]>target){
            target = arr[i];
            System.out.println(target);
        }
    }   
    }
}
