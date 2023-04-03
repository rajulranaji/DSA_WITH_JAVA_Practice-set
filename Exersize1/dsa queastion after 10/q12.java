//Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.//
import java.util.*;
public class q12 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char again;
        do{
         System.out.println("Enter here a no:-");
         int a = sc2.nextInt();
         System.out.println("Do you want to enter no again?[y/n]");
         again = sc2.next().charAt(0);
         if(a>max){
            max=a;
         }
         if(a<min){
            min=a;
         }
        }while(again=='y'||again=='Y');
        System.out.println("your maximum value is:-"+" "+max);
        
    }
}
