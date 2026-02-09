
public class Merge_sort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3};
        for (int ele : arr) {
            System.err.println(ele + " ");

        }
        Mergesort(arr);
        System.out.println("Sorted Array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    public static void Mergesort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return;
        }

        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int indx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[indx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[indx++];
        }
        Mergesort(a);
        Mergesort(b);
        merge(a, b, arr);

    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

}
