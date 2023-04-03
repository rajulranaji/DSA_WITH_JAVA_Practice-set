import java.util.*;
public class leedcodeQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter here array elemets:");
        int arr []  = new int [5];
        for(int i=1; i<5; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Your Elements is:");
        for(int i=1;i<5;i++){
            System.out.println(arr[i]);
        }
        System.out.println("give me the target:");
        int a = input.nextInt();
       for(int j:arr){
        if(a==j){
            System.out.println(j.reverse());
        }
       }
    }
}
