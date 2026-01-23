
import java.util.Scanner;

public class Nthfabonaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(fabonaci(n));

    }

    public static int fabonaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fabonaci(n - 1) + fabonaci(n - 2);
    }
}
