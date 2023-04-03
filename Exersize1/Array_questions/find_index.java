import java.util.*;

public class find_index {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter here size of array:");
        int a = sc1.nextInt();
        System.out.println("Enter here Elements of array:");
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc1.nextInt();
        }
        System.out.println("Your Elements of array is:" + " " + Arrays.toString(arr));
        select(a, a, arr, a);
    }

    public static void select(int index, int i, int arr[], int item) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Who element index you want to know?");
        item = sc2.nextInt();
        index = -1;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                index = i;
            }
        }
        System.out.println("Your Element Index is:" + " " + index);
    }
}
