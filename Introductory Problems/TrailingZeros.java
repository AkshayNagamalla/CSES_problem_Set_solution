import java.util.*;
/*
 * link :- https://cses.fi/problemset/task/1618/
 * 
 */
public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int c = 0;
        int d = 5;
        while (d <= n) {
            c += Math.floorDiv(n, d);
            d *= 5;
        }

        System.out.println(c);

    }
}