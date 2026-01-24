
import java.util.Scanner;

public class Unique_path {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:-");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:-");
        int n = sc.nextInt();
        System.out.println("Total number of unique path from starting to ending:-" + unique(m, n));

    }

    public static int unique(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return unique(m - 1, n) + unique(m, n - 1);
    }
}
