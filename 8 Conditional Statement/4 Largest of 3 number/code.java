import java.util.*;

public class code {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int firstnum = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int secnum = sc.nextInt();
        System.out.println("Enter the 3rd number: ");
        int thirdnum = sc.nextInt();
        if (firstnum>secnum && firstnum>thirdnum){
            int largest = firstnum;
        } else if (secnum>firstnum && secnum>thirdnum) {
            int largest = secnum;
        }else {
            int largest = thirdnum;
        }
        System.out.println(largest);
        sc.close();
        }
    }
