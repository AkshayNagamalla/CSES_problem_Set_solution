import java.io.PrintWriter;
import java.util.*;

/*
 * https://cses.fi/problemset/task/2205
 */
public class GreyCode {
    static PrintWriter out = new PrintWriter(System.out);

    public static void GreyCode(int n) {
        if (n == 1) {
            out.println("0\n1");
        }
        generateGreyCode(n, n);
        out.flush();
    }

    public static List<String> generateGreyCode(int n, int curr) {
        if (curr == 1) {
            return Arrays.asList("0", "1");
        }
        List<String> prev = generateGreyCode(n, curr - 1);
        List<String> res = new ArrayList<String>();
        int prevSize = prev.size();
        for (int i = 0; i < prevSize; i++) {

            if (n == curr)
                out.println("0" + prev.get(i));
            else
                res.add("0" + prev.get(i));
        }
        for (int i = prevSize - 1; i >= 0; i--) {
            if (n == curr)
                out.println("1" + prev.get(i));
            else
                res.add("1" + prev.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        GreyCode(n);

    }
}