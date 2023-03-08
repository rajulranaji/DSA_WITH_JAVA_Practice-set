// import java.util.*;
// public class functions {
//     public static int functions(int a , int b){
//               int sum = a+b;
//               return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter here two no:-");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum2 = functions(a, b);
//         System.out.println("your sum of tow numbers is:"+ sum2);
//     }
// }
import java.util.*;
public class  functions{
    public static int multiply(int a ,int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("Enter your 1st numbers:-");
        int a = sc2.nextInt();
        System.out.println("Enter here your 2nd no:-");
        int b = sc2.nextInt();
        System.out.println("your multiplication of "+a+" "+"and"+" "+b +" "+"is:-" +  multiply(a, b));
    }
}
