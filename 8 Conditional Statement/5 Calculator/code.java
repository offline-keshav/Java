import java.util.Scanner;

public class code{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operator( + - * /): ");
        char operator = sc.next().charAt(0);
        int ans = 0 ;
        switch (operator) {
            case '+': ans = num1 + num2;                 
                break;
            case '-': ans = num1 - num2;                 
                break;
            case '*': ans = num1 * num2;                 
                break;
            case '/': ans = num1 / num2;                 
                break;
        
            default: System.out.print("U didn't entered a operator.");
                break;
        }
        System.out.println("The answer is: "+ ans );
        sc.close();

    }
}