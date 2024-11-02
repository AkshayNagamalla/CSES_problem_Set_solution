import java.util.*;

/*
 * link : https://cses.fi/problemset/task/1755
 */
public class PalindromicReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int arr[] = new int[26];
        int oddC = 0;
        StringBuilder res = new StringBuilder();

        for (char letter : s.toCharArray()) {
            int index = letter - 'A';
            arr[index] += 1;
            if (arr[index] == 2) {
                oddC -= 1;
                arr[index] = 0;
                res.append(letter);
            } else {
                oddC += 1;
            }
        }

        if (oddC > 1) {
            System.out.println("NO SOLUTION");
        } else if (oddC == 1) {
            System.out.print(res.toString());
            for (int i = 0; i < 26; i++) {
                if (arr[i] == 1) {
                    System.out.print((char) (i + 'A'));
                    break;
                }
            }
            res.reverse();
            System.out.println(res.toString());
        } else {
            System.out.print(res.toString());
            res.reverse();
            System.out.println(res.toString());
        }
    }
}