// import java.util.*;
// public class input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int [5];
//         System.out.println("Enter here array size:");
//         int a = sc.nextInt();
//         System.out.println("Enter here Array Elements:");
//         // int a = input.nextInt();
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("your elements is:");
//        for(int i=0;i<a;i++){
//         System.out.println(arr[i]);
//        }
//     }
// }
import java.util.*;
public class input{
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter here row coutn:");
        int row = c.nextInt();
        System.out.println("Enter here column coutn:");
        int col = c.nextInt();
        int arr[][] = new int [row][col];
        System.out.println("Enter your Array Elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = c.nextInt();
            }
        }
        System.out.println("Your Array Elements are:");
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
            System.out.println(arr[i][j]+" ");
            System.out.println();
           }
        }
    }
}

