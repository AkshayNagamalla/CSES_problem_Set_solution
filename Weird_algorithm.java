import java.util.*;

/*
 * link :- https://cses.fi/problemset/task/1068/
 * 
 * Mistakes that i made
 * => use int as datatype for n values 
 * as multiplying odd with 3 might exceed the int limit. 
 */
class Weird_algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        while (n != 1) {
            System.out.print(n + " ");
            if ((n & 1) == 1) {
                n *= 3;
                n += 1;
            } else {
                n /= 2;
            }
        }
        System.out.println(1);
    }
}