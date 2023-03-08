// Q 1).
// import java.util.*;
// public class lecture3homework {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("even no.");
//     System.out.println("Enter here a no:-");
//     int a = sc.nextInt();
//     // int n = a/2;
//     for(int i=1;i<=a;i++){
//         if(i%2 == 0){
//         System.out.println("your even no is:-"+ i);
//     }
//     }
//     }
// }
// Q 2).
import java.util.*;
public class lecture3homework{
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("driving score:");
        System.out.println("Do you want our feedback?[1(tue),0(faules)]");
        int a = sc2.nextInt();
        int score2;
        if(a==1){
            do{ 
            System.out.println("Enter here your school score:");
            int score = sc2.nextInt();
               if(score == 90){
                System.out.println("very good.");
               }
               else if(score == 60){
                System.out.println("nice but need to improve.");
               }
               else if(score == 30){
                System.out.println("you are not aligebal.");
               }
               System.out.println("your want to feel your school score again?[1,0]");
                score2 = sc2.nextInt();
            }
            while(score2==1);
            }
    }
    }
// import java.util.*;
// public class lecture3homework{
//     public static void main(String[] args) {
//         // Scanner input = new Scanner(System.in);
//         int n =5;
//         int m = 4;
//         for(int i=1;i<n;i++){
//             // System.out.println("*");
//               for(int j=1;j<m;j++){
//                 System.out.println("*");
//               }
//               System.out.println(" ");
//         }
//     }
//     }

