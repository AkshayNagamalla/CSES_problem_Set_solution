import java.util.Scanner;
import java.io.*;

/*
 * https://cses.fi/problemset/task/1070
 */

public class Permutation {
    public static void permutation(int n) {
        PrintWriter out = new PrintWriter(System.out);
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
            return;
        }
        for (int i = 2; i <= n; i += 2) {
            out.print(i + " ");
        }
        for (int i = 1; i <= n; i += 2) {
            out.print(i + " ");
        }

        out.flush();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        permutation(n);
    }
}