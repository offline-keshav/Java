import java.util.*;

public class code {
    public static void main(String aeg[]){
        System.out.print("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        if (a>b) {
            System.out.print("1st is greater than 2nd");
        } else {
            System.out.print("2nd is greater than 1st");
        }

    }
}
