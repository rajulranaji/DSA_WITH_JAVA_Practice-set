import java.util.*;

import javax.sound.sampled.SourceDataLine;
class root{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here a integer:-");
          int a = sc.nextInt();
        //   int ans;
          int arr[]= new int[a];
          for(int i=1;i<arr.length;i++){
            if(i*i==a){
                // ans = i;
                System.out.println("Your root element is:"+i);
            }
          }
    }
}