
public class ArrayRecursion {

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 5};
        recursion(arr, 0);
    }

    public static void recursion(int[] arr, int indx) {
        if (indx == arr.length) {
            return;
        }
        System.out.print(arr[indx] + " ");
        recursion(arr, indx + 1);

    }
}
