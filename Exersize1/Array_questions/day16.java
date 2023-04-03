
//bad version.
import java.util.*;
public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here size of array:-");
        int a = sc.nextInt();
        System.out.println("Enter Elements of array in sorted formate:-");
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array Elements is:-");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter here your target:-");
        int target = sc.nextInt();
        int ans = binary(target, target, target, arr, target, a);
        if (ans == -1) {
                System.out.println("Sorry Your element is no found.");
        }
        else{
            System.out.println("Your element index is:-");
            System.out.println(ans);
        }
    }

    static int binary(int start, int mid, int end, int arr[], int target, int ans) {
        start = 0;
        end = arr.length - 1;
        do {
            mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        } while (start <= end);
        return -1;
    }
}