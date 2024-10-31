import java.util.*;

/*
 * link : https://cses.fi/problemset/task/1069 
 */
public class Repetations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char prev = s.charAt(0);
        int maxC = 0;
        int c = 1;

        for (int i = 1; i < n; i++) {
            if (prev == s.charAt(i))
                c++;
            else {
                maxC = Math.max(maxC, c);
                prev = s.charAt(i);
                c = 1;
            }
        }

        maxC = Math.max(maxC, c);
        System.out.println(maxC);
        sc.close();
    }
}