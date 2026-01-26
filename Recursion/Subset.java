
import java.util.*;

public class Subset {

    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;

        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                if (dp[j - arr[i]]) {
                    dp[j] = true;
                }
            }
        }

        return dp[sum];
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();

        Boolean result = isSubsetSum(arr, sum);

        if (result) {
            System.out.println("Subset with given sum exists ");
        } else {
            System.out.println("Subset with given sum does NOT exist ");
        }

        sc.close();
    }
}
