import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void reverseInPlace(int[] arr) {
        if (arr == null) return;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        if (!sc.hasNextInt()) {
            System.out.println("Please provide array size followed by elements.");
            sc.close();
            return;
        }
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Not enough elements provided.");
                sc.close();
                return;
            }
            arr[i] = sc.nextInt();
        }

        System.out.println("Original: " + Arrays.toString(arr));
        reverseInPlace(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));

        sc.close();
    }
}