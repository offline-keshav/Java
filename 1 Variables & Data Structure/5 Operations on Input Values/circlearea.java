import java.util.*;

public class circlearea {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        System.out.println(area);
        sc.close();
    }
}