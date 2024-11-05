import java.util.*;
import java.io.*;

public class CreatingStrings {
    public static void permutations(char[] arr) {
        int i = arr.length - 2;
        StringBuffer output = new StringBuffer();
        output.append(String.valueOf(arr)).append("\n");
        int nearSmall = -1;
        int c = 1;
        while (true) {
            i = arr.length - 2;
            while (i >= 0 && (arr[i] >= arr[i + 1])) {
                i--;
            }
            if (i < 0) {
                System.out.print(c+"\n"+output.toString());
                return;
            }
            for (int j = arr.length -1 ; j > i; j--) {
                if (arr[j] > arr[i]) {
                    swap(arr, i, j);
                    break;
                }
            }

   
            reverse(arr, i + 1, arr.length - 1);
            output.append(String.valueOf(arr)).append("\n");
            c++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // convert input string to char array
        char letters[] = sc.nextLine().toCharArray();
        sc.close();

        // sort the characters based on ASCII value
        Arrays.sort(letters);
        permutations(letters);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}
