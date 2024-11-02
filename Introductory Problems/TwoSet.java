import java.util.*;

public class TwoSet {
    static long sumofN(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();

        long sum = sumofN(n);

        if ((sum & 1) == 1) {
            System.out.print("NO");
        } else {
            sum /= 2;
            System.out.println("YES");
            long sumA = 0L;
            int ac = 0;
            long sumB = 0L;
            int bc = 0;
            StringBuilder setA = new StringBuilder();
            StringBuilder setB = new StringBuilder();

            for (long i = n; i > 0; i--) {
                if ((sumA <= sumB) && (sumA + i <= sum)) {
                    sumA += i;
                    setA.append(i).append(" ");
                    ac++;
                } else {
                    sumB += i;
                    setB.append(i).append(" ");
                    bc++;
                }
            }
            System.out.println(ac);
            System.out.println(setA.toString().trim());
            System.out.println(bc);
            System.out.println(setB.toString().trim());
        }
    }
}
