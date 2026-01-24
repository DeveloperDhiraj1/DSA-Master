
import java.util.Scanner;

public class NtoOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n = sc.nextInt();
        num(n);
    }

    public static int num(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        return num(n - 1);

    }
}
