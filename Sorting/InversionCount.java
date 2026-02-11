
public class InversionCount {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3};
        conversion(arr);

    }

    public static void conversion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println(arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }
        System.out.print("Total inversion count:-" + count);
    }
}
//Method 2
// public class InversionCount {

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 1, 3};
//         int count = mergeSort(arr, 0, arr.length - 1);
//         System.out.println("Total inversion count: " + count);
//     }
//     public static int mergeSort(int[] arr, int left, int right) {
//         int count = 0;
//         if (left < right) {
//             int mid = left + (right - left) / 2;
//             count += mergeSort(arr, left, mid);       // Left half
//             count += mergeSort(arr, mid + 1, right);  // Right half
//             count += merge(arr, left, mid, right);    // Merge step
//         }
//         return count;
//     }
//     public static int merge(int[] arr, int left, int mid, int right) {
//         int[] temp = new int[right - left + 1];
//         int i = left;       // Left subarray pointer
//         int j = mid + 1;    // Right subarray pointer
//         int k = 0;
//         int count = 0;
//         while (i <= mid && j <= right) {
//             if (arr[i] <= arr[j]) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//                 // Count inversions
//                 count += (mid - i + 1);
//             }
//         }
//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }
//         while (j <= right) {
//             temp[k++] = arr[j++];
//         }
//         // Copy back to original array
//         for (int p = 0; p < temp.length; p++) {
//             arr[left + p] = temp[p];
//         }
//         return count;
//     }
// }
