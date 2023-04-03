import java.util.*;

public class day15leedcode {
    public static void main(String[] args) {
        Scanner newarr = new Scanner(System.in);
        System.out.println("Enter here size of array:");
        int len = newarr.nextInt();
        int arr[] = new int[len];
        input_display(0, arr, 0);
        calculation(0, 0, 0, arr);
    }
         
    public static void input_display(int input, int arr[], int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert here arr elements:");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("Your Array Elements is: "+" "+Arrays.toString(arr));
    }

    public static void calculation(int max, int min, int i, int arr1[]) {
        max = arr1[0];
        min = arr1[0];
        System.out.println("Your max value in array is:");
        for (i = 0; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println(max);
        System.out.println("Your minimum value in array is:");
        for (i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
        System.out.println(min);
    }
}
