import java.io.PrintWriter;
import java.util.*;

public class TwoKinghts {
    public static long possibleWays(int k) {
        long n = k * k;
        return n * (n - 1) / 2;
    }

    public static long attackWays(int n) {
        return 4 * (n - 1) * (n - 2);

    }

    public static void solve(int n) {
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 1; i <= n; i++) {
            out.println(possibleWays(i) - attackWays(i));
        }
        out.flush();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        solve(k);
    }
}