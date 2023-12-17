import java.util.*;

public class code {
    public static void main(String aeg[]){
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 ==0){
            System.out.println("number is an even number");
        } else {
            System.out.println("Number is an odd");
        }
        sc.close();
    }
}