import java.util.*;

public class AppleDivison {
    public static long min_diff(int[] arr, int i,long a_sum, long b_sum) {
        if(i == arr.length) {
            return Math.abs(a_sum - b_sum);
        }
        return Math.min(min_diff(arr, i+1, a_sum + arr[i], b_sum), min_diff(arr, i+1, a_sum , b_sum + arr[i]));
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(min_diff(arr, 0,0L, 0L));
    }
}