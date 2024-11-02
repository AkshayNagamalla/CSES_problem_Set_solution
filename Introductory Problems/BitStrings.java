import java.util.*;

public class BitStrings {
    static final int MOD = 1000000007;

    public static long binMod(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }

        long rootN = binMod((int) n / 2);
        //System.out.println((int) n / 2 + " " + rootN);
        if (n % 2 == 0) {
            return (rootN * rootN) % MOD;
        }
        return ((rootN * rootN) % MOD * 2) % MOD;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(binMod(n));
    }
}