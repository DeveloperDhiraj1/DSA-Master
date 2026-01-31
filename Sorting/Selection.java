
public class Selection {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7};
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;

        }

        print(arr);
    }
}
