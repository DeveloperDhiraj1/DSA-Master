
import java.util.Scanner;

public class Nth_Stair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stairs:-");
        int n = sc.nextInt();
        System.out.println("Total ways:-" + Stair(n));
    }

    public static int Stair(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 2) {
            return n;
        }
        return Stair(n - 1) + Stair(n - 2);
    }
}
