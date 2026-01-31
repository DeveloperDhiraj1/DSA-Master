
public class Array {

    public static void main(String[] args) {
        int[] arr = {9, 6, 34};
        int max = 0;
        int smax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];

            }

        }
        System.out.print(smax);

    }
}
