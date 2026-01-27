
import java.util.*;

public class Parenthesis {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            Parenthesis obj = new Parenthesis();
            ArrayList<String> result = obj.generateParentheses(n);

            for (String s : result) {
                System.out.println(s);
            }
        }
    }

    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> ans = new ArrayList<>();

        if (n % 2 != 0) {
            return ans;
        }

        int pairs = n / 2;
        generate(pairs, 0, 0, "", ans);
        return ans;
    }

    public void generate(int pairs, int open, int close, String s, ArrayList<String> ans) {

        if (open == pairs && close == pairs) {
            ans.add(s);
            return;
        }

        if (open < pairs) {
            generate(pairs, open + 1, close, s + "(", ans);
        }

        if (close < open) {
            generate(pairs, open, close + 1, s + ")", ans);
        }
    }
}
