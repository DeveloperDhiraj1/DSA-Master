
import java.util.Scanner;

public class One_to_nth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:-");
        int n = sc.nextInt();
        num(1, n);
    }

    public static void num(int x, int n) {
        if (x > n) {
            return;
        }
        System.out.println(x);
        num(x + 1, n);
    }
}
