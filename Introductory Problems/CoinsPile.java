import java.util.*;
import java.io.*;

/*
 * link : https://cses.fi/problemset/task/1754
 */
public class CoinsPile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PrintWriter out = new PrintWriter(System.out);

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > 2 * b || b > 2 * a) {
                out.println("NO");
            } else if ((a + b) % 3 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
        sc.close();
    }
}