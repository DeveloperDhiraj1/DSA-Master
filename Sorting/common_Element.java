
import java.util.*;

public class common_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of First Arrays:-");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element:-");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Size of First Arrays:-");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the element:-");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        commonElement(a, b);

    }

    public static ArrayList<Integer> commonElement(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }
        }

        System.out.print("Common Element in this Arrays:-" + ans);
        return ans;
    }
}
