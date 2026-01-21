import java.util.Scanner;

public class MaxMinArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // n
        // n integers
        if (!sc.hasNextInt()) {
            System.out.println("Please provide array size followed by elements.");
            return;
        }

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Insufficient elements provided.");
                return;
            }
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}