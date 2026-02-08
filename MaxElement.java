
public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 666, 1, 6, 9, 67};
        int max = 0;
        int smax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];

            }
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
