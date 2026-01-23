
import java.util.Scanner;

public class Power_of_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base values:-");
        int a = sc.nextInt();
        System.out.println("Enter the Exponential number:-");
        int b = sc.nextInt();
        int num = pow(a, b);
        System.out.println(num);
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int call = pow(a, b / 2);
        if (b % 2 == 0) {
            return call * call; 
        }else {
            return call * call * a;
        }

    }
}
