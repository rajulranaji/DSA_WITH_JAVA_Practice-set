
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;
        int a;
        do {
            System.out.println("Enter here a number sir:-");
            a = sc.nextInt();
            System.out.println("Do you want to enter number again?[y/n]");
            again = sc.next().charAt(0);
            if (a > 0) {
                positive_count++;
            } else if (a < 0) {
                negative_count++;
            } else {
                zero_count++;
            }
        } while (again == 'y');

        System.out.println("your positive no is:-" + " " + positive_count);
        System.out.println("your nagetive no is:-" + " " + negative_count);
        System.out.println("your zero's is:-" + " " + zero_count);
    }
}
