// import java.util.*;
// public class input_show {
//     public static void main(String[] args) {
//         int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Length of array:");
//         a = sc.nextInt();
//        int [] arr = new int [10];
//        System.out.println("Enter here elements of array:");
//        for(int i=0;i<a ;i++){
//          arr[i]= sc.nextInt();
//        }
//        System.out.println("Your array elements of array is:");
//        for(int i=0;i<a;i++){
//         // int arrays1 = arr[i];
//         System.out.println(String.valueOf(arr[i]));
//        }
//        System.out.println();
//     //    int [] arr2 = new int[10];    
//     }
// }
import java.util.*;
class input_show{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here your row count:");
        int row = sc.nextInt();
        System.out.println("Enter here coloumn coutn:");
        int col = sc.nextInt();
        System.out.println("Enter here array row elements:");
        int Arr1[] =   new int[row];
        for(int i=1; i<row; i++){
                 Arr1[i]= sc.nextInt();
        }
        System.out.println("Enter here col Elements:");
        int Arr2[] = new int[col];
        for(int j=1; j<col; j++){
             Arr2 [j]  = sc.nextInt();
        }
        System.out.println("your elements are:");
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                System.out.println(Arr1[i]);
                System.out.println(Arr2[j]);
            }
        }
    }
    }
