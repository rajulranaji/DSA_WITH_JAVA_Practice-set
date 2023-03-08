import javax.sql.rowset.spi.SyncResolver;

import java.util.*;
public class hello {
public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("hello sir");
    Scanner sc = new Scanner(System.in);
   int a;
    do{
        System.out.println("Hello that is your calculator:");
        System.out.println("What do you want addition[+],substration[-],division[/],multiplication[*]?");
        String user = sc.nextLine();
        if (user.equals("addition")) {
                System.out.println("Ok sir plz put your numbers:");
                System.out.print("Enter here your first no:-");
                int add1 = sc.nextInt();
                System.out.print("Enter here your second no:-");
                int add2 = sc.nextInt();
                int user_addtion = add1 + add2;
                System.out.print("Your addition is:" + user_addtion);
        } else if (user.equals("substration")) {
                System.out.println("Ok sir plz put your numbers:");
                System.out.print("Enter here your large no:-");
                int subs1 = sc.nextInt();
                System.out.print("Enter here your small no:-");
                int subs2 = sc.nextInt();
                int user_subs = subs1 - subs2;
                System.out.print("Your substration is:" + user_subs);
        } else if (user.equals("multiplication")) {
                System.out.println("Ok sir plz put your numbers:");
                System.out.print("Enter here your first no:-");
                int mu1 = sc.nextInt();
                System.out.print("Enter here your second no:-");
                int mu2 = sc.nextInt();
                int multi = mu1 * mu2;
                System.out.println("Your multiplication is:" + multi);
        } else if (user.equals("division")) {
                System.out.println("Ok sir plz put your numbers:");
                System.out.print("Enter here your first no:-");
                int divi1 = sc.nextInt();
                System.out.print("Enter here your Second no:-");
                int divi2 = sc.nextInt();
                int user_divi = divi1 / divi2;
                System.out.println("Your division is:\n" + user_divi);
        }
        System.out.println("Do you want to calculate again?[1(tru),0(fauls)]");
        a = sc.nextInt();
}
    while(a == 1);
}
}
