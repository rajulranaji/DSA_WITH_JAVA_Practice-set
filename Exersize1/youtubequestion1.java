//Q1).Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
// import java.util.*;
// public class youtubequestion1{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter here your 1st no:-");
//         int a = in.nextInt();
//         System.out.println("Enter here your 2nd no:-");
//         int b = in.nextInt();
//         System.out.println("Enter here your 3rd no:-");
//         int c= in.nextInt();
//         int myMethodgreater = myMethodgreater(a,b,c);
//         int minimum = minimum(a,b,c);
//     }
//     static int myMethodgreater(int a,int b,int c) {
//         //  int max;
//         if(a>b && b>c){
//             System.out.println("your greater number is:-"+" "+a);
//         }
//         else if(b>a && a>c){
//             System.out.println("your greater number is:-"+" "+b);
//         }
//         else{
//             System.out.println("your greater number is:-"+" "+c);
//         }
//         return 0;
//     }
//   static int minimum(int a,int b, int c){
//     if(a<b && b<c){
//         System.out.println("your smallest number is:-"+" "+a);
//     }
//     else if(b<a && a<c){
//         System.out.println("your smallest number is:-"+" "+b);
//     }
//     else{
//         System.out.println("your smallest number is:-"+" "+c);
//     }
//     return 0;
// }
//   }
  //Q2).Define a program to find out whether a given number is even or odd.
//   import java.util.*;
//   public class youtubequestion1{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Here your event and odd:");
//         System.out.println("Enter here your Number");
//         int a = in.nextInt();
//         int EvenOdd = EvenOdd(a);
//     }
//     public static int EvenOdd(int a){
//         // int Even = 0;
//         // int Odd = 0;
//          if(a%2==0){
//              System.out.println("your number"+" "+"is"+" "+"even");
//             return 0;
//          }
//          else{
//              System.out.println("your number"+" "+"is"+" "+"Odd");
//             return 0;
//          }
//     }
//   }
// Q3).Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

// import java.util.*;
// public class youtubequestion1{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Here your Area and Circumference calculator.");
//         System.out.println("Enter the radius of the circul:");
//         int radius = in.nextInt();
//         int circumference = circumference(radius);
//         int dircumference = Area(radius);
//     }
//     static int circumference(int radius){
//            double circu = 2*(3.14*radius);
//            System.out.println("Your Circumference is:"+circu);
//            return 0;
//     }
//     static int Area(int radius){
//         double Area = (radius*radius)*3.14;
//         System.out.println("Your Area of Circle is:"+Area);
//         return 0;
//     }
// }

// Q4.)Define a method to find out if a number is prime or not.
// import java.util.*;
// public class youtubequestion1{
//     public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Entre your Number:");
//        int a = in.nextInt();
//        int check = check(a);
//     }
//     static int check(int a){
//     int count =0;
//     for(int i=0;i<=0;i++){
//         if(i%2==0){
//             count++;
//         }
//         if(count==2){
//             System.out.println(a+"is prime.");
//         }
//         else{
//             System.out.println(a+"is not prime");
//         }
//     }     
//     return 0;
// }
// }
//Q5).Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
import java.util.*;
public class youtubequestion1{
    public static void main(String[] args) {
        int sum;
        int math;
        int English;
        int chemestry;
        int physics;
        Scanner in = new Scanner(System.in);
        System.out.println("Here Your 10th MarkSheet.");
        System.out.println("Enter here your math's no:-");
         math = in.nextInt();
        System.out.println("Enter here your English no:-");
         English = in.nextInt();
        System.out.println("Enter here your chemestry no:-");
         chemestry = in.nextInt();
        System.out.println("Enter here your physics no:-");
         physics = in.nextInt();
         int MarkSheet = MarkSheet(math, English, chemestry, physics, sum);
        
    }
    static int MarkSheet(int math,int English, int chemestry,int physics, int sum);{
        
    }
}
