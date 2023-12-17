import java.util.*;

public class code {
    public static void main ( String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the income:");
        int income= sc.nextInt();
        if (income<500000) {
            System.out.println("Tax aplicable is o percent. Tax = 0");
        } else {
            if (income>=500000 && income<1000000) {
                int tax = income*5/100;
                System.out.println("Tax applicable is 5 percent. Tax = "+tax);
            } else {
                int tax = income*10/100;
                System.out.println("Tax applicable is 10 percent. Tax = "+tax);

            }
        }
        sc.close();
    }
    
}
