// //Write a Java program to sum values of an array//
// public class question_1 {
//    public static void main(String[] args) {
//     int[] arr = {12,11,33,445,4};
//     int sum =0 ;
//     for(int i:arr){
//               sum += i;
//             }
//             System.out.println("your sum value is:"+sum);
// }
// }
// Write a Java program to print the following grid
// class question_1{
//     public static void main(String[] args) {
//         int [][] arr = new int[10][10];
//         for(int i=0;i<10;i++){
//             // System.out.println("-");
//             for(int j=0;j<10;j++){
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }
// . Write a Java program to calculate the average value of array elements
// class question_1{
//   public static void main(String[] args) {
//     int [] arr = {11,33,33,44,33};
//     int sum = 0;
//     int average = 0;
//     for(int i:arr){
//       sum += i;
//     }
//     average = sum/arr.length;
//     System.out.println(arr.length);
//     System.out.println(sum);
//     System.out.println("your average is:"+" "+average);
//   }
// }
// Write a Java program to test if an array contains a specific value.
import java.util.*;
class question_1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int index = -1;
    int arr  []= {11,3,4,55,66,6};
    System.out.println("Your arr is:"+Arrays.toString(arr));
    System.out.println("Enter what Number you find?:");
    int item = sc.nextInt();
    int j;
    for(  j=0;j<arr.length;j++){
      //  item = j;
      if(arr[j]==item){
        index = j;
         // break;
        }
    }
    if(index==j){

        System.out.println("your item found in index no:"+" "+index);
    }
    else{
     System.out.println("Sorry sir your item is not found.");
    }
    }
  }
// Write a Java program to find the index of an array element
// import java.util.*;
// public class question_1{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int [] arr = {};
//     System.out.println("Enter The Array Element's:");
//     arr[5] = sc.nextInt();
//     // int a = sc.nextInt().arr[5];
//      System.out.println( "Your Array Elements is:");
//     for(int i:arr){
//       System.out.println(i);
//     }
//     System.out.println();
//     System.out.println("Your Array Index's is:");
//     for(int j=0;j<arr.length;j++){
//       System.out.println(j);
//     }
//     System.out.println();
//   }
// }
//   public static void input( int arr){
//     Scanner sc = new Scanner(System.in);
//      System.out.println("Enter here your Array Element's:");
//     arr = sc.nextInt();
//   }
// }
//