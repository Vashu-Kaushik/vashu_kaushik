import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {

        int[][] a = new int[3][3];
        int totalSum = 0;
        int firstRowSum = 0;
        int firstColSum = 0;
        int diagonalSum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of 3x3 matrix:");

        // Input and calculations in single traversal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

                totalSum += a[i][j];

                if (i == 0) {
                    firstRowSum += a[i][j];
                }

                if (j == 0) {
                    firstColSum += a[i][j];
                }

                if (i == j) {
                    diagonalSum += a[i][j];
                }
            }
        }

        // Printing matrix
        System.out.println("\nGiven two dimensional array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Results
        System.out.println("\nTotal sum: " + totalSum);
        System.out.println("Sum of first row: " + firstRowSum);
        System.out.println("Sum of first column: " + firstColSum);
        System.out.println("Sum of diagonal elements: " + diagonalSum);

        sc.close();
    }
}
