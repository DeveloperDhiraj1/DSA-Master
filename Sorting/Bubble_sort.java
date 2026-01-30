
import java.util.Scanner;

public class Bubble_sort {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of arrays");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.print("Sorted array:-");
        print(arr);

    }
}
