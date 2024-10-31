import java.util.*;

/*
 * link : https://cses.fi/problemset/task/1070
 */
public class IncreasingArray {
    public static long minMoves(int[] arr) {
        long mc = 0;

        for (int i = 1; i < arr.length; i++) {
            mc += Math.max(arr[i], arr[i - 1]) - arr[i];
            arr[i] = Math.max(arr[i], arr[i - 1]);

        }
        return mc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(minMoves(arr));
    }
}