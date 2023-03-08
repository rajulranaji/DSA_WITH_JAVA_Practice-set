// package Exersize1;
// import java.util.*;
// public class question1 {
//     public static void prime(int a){
//       if(a%a == 0 || a%1 == 0){
//         System.out.println("your no is pirme.");
//         return;
//       }
//       else{
//         System.out.println("your not is not prime.");
//       }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter here your no:-");
//         int a = sc.nextInt();
//         //  int result = prime(a);
//         // System.out.print("your result is"+ prime(a));
//         prime(a);
//     }
// }
//q2).
// import java.util.*;
// public class question1{
//   public static void question1(int a){
//     if(a%2==0){
//       System.out.println("Your number is even.");
//     }
//     else{
//       System.out.println("your number is not even.");
//     }
//     return;
//   }
//   public static void main(String[] args) {
//     Scanner sc2 = new Scanner(System.in);
//     System.out.println("Enter here a no for checking, that is even or not:-");
//     int a = sc2.nextInt();
//     question1(a);
//   }
// }
//Q3).
import java.util.*;
public class question1{
public static void table(int a){
  int i;
  for(i=1;i<=10;i++){
    int table = a*i;
    System.out.println(table);
  }
  return;
}
  public static void main(String[] args) {
    Scanner sc3 = new Scanner(System.in);
    System.out.println("Enter here a number:-");
    int a = sc3.nextInt();
    System.out.println("your table is:");
     table(a);
  }
}
