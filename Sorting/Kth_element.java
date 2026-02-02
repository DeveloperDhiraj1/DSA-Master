
import java.util.Scanner;

public class Kth_element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth Element:-");
        int k = sc.nextInt();
        Kth(arr, k);

    }

    public static int Kth(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        System.out.print(arr[k - 1]);
        return arr[k - 1];

    }
}
