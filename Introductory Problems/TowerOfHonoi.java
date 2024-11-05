import java.util.*;
import java.io.*;

public class TowerOfHonoi {
    static PrintWriter out = new PrintWriter(System.out);
    static int count = 0;

    static void helper(int n, int src, int temp, int dst) {
        if (n == 0) {
            return;
        }
        helper(n - 1, src, dst, temp);
        count++;
        out.println(src + " " + dst);
        helper(n - 1, temp, src, dst);
    }

    static void toh(int n) {
        out.println((int) Math.pow(2, n) - 1);
        helper(n, 1, 2, 3);
        out.flush();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        toh(n);
    }
}