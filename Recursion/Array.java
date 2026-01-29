
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;

        int[] ans = new int[2 * n];
        fill(nums, ans, 0, n);

        System.out.println(Arrays.toString(ans));
    }

    static void fill(int[] nums, int[] ans, int i, int n) {
        // base case
        if (i == n) {
            return;
        }

        ans[i] = nums[i];
        ans[i + n] = nums[i];

        // recursive call
        fill(nums, ans, i + 1, n);
    }
}
