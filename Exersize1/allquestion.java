// Q.1)
// import java.util.*;
// public class allquestion {
//     public static int average(int a,int b , int c){
//         int ava = (a+b+c)/ 2;
//         return ava;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Hello sir plz enter here three numbers:-");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int ava = average(a, b, c);
//         System.out.println("your average is:"+ava);
//     }
// }
// Q.2)
// import java.util.*;
// public class allquestion{
//     public static void sumofodd(int a){
         
//         // int even = (a%2)=0;
//         int sum =0;
//             for(int i=1;i<=a;i++){
//                if(a%2 != 0){
//                sum = a+i;
//                System.out.println(sum);
//                }
//             }
//         // else{
//         //     System.out.println(" ");
//         // }
//         // System.out.println(odd);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc2 = new Scanner(System.in);
//         System.out.println("Enter here a number:-");
//         int a = sc2.nextInt();
//         System.err.println("your sum of odd is:-");
//          sumofodd(a);
//     }
// }
// Q3).
// import java.util.*;
// // public class allquestion{
// //     public static void greater(int a, int b){
// //         if(a>b){
// //             System.out.println(a+" "+"is greater.");
// //         }
// //         else{
// //             System.out.println(b+" "+"is greater.");
// //         }
// //     }
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter here two numbers:-");
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         greater(a, b);
// //     }
// // }
// // Q4)
// // import java.util.*;
// // public class allquestion{
// //     public static void circule(Double r){
// //         double cir = 2*(r*22/7);
// //         System.err.println(cir);
// //         return ;
// //     }
// //     public static void main(String[] args) {
// //         Scanner sc4 = new Scanner(System.in);
// //         System.out.println("Enter here the circule radius:");
// //         double r = sc4.nextDouble();
// //         System.out.println("circumference of a circle.");
// //         circule(r);
// //     }
// // }
// // Q5).
// // import java.util.*;
// // public class allquestion{
// //     public static void voting(int age){
// //            if(age>18){
// //             System.out.println("Your eligible for voting.");
// //            }
// //            else{
// //             System.out.println("Your are not aligible for voting.");
// //            }
// //     }
// // public static void main(String[] args) {
// //     Scanner sc5 = new Scanner(System.in);
// //     System.out.println("Enter here your age:-");
// //     int age = sc5.nextInt();
// //     voting(age);
// // }
// // }
// // // Q7)
// // import java.util.*;
// // public class allquestion{
// //     // public static void still(String a,String name){
// //     //   do{
// //     //         System.out.println("enter your name:");

// //     //   }while(a.equals("yes"));
// //     // }
// //     public static void main(String[] args) {
// //         Scanner sc6 = new Scanner(System.in);
// //         String a,name;
// //         do{
// //             System.err.println("Enter here your name:-");
// //         name = sc6.nextLine();
// //         System.out.println("your name is:"+name);
// //         System.out.println("Do you want change your name?[yes,no]");
// //          a = sc6.nextLine();
// //     }while(a.equals("yes"));
// //     //    still(a, name);
// // if(a.equals("no"))
// // System.out.println("Ok then your currect name is:"+name);
// // System.out.println("have a good day.");
// //     }
// // }
// // Q9).
// import java.util.*;
// public class allquestion{
//     int t1,t2;
//     public static void fibonecci(int n,int t1, int t2){
//         int nexterm = t1+t2;
//         System.out.println("your 1st and second 2nd term is:"+t1+" "+t2);
//         // for(int i=3;i<=n;++i){
//         //     System.out.println("your fibonecci no of"+n+" "+"is"+nexterm);
//         //    t1 =t2;
//         //    nexterm = t2;
//         //    nexterm = t1+t2;
//         // }
//     }
//     public static void main(String[] args) {
//         Scanner sc9 = new Scanner(System.in);
//         System.err.println("Enter a number:-");
//         int n = sc9.nextInt();
//          fibonecci(n, n, n);
//     }
// }
