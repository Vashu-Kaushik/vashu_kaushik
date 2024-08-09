public class matrix {

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirstMatrix = firstMatrix.length;
        int colsFirstMatrix = firstMatrix[0].length;
        int colsSecondMatrix = secondMatrix[0].length;

        if (colsFirstMatrix != secondMatrix.length) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        }

        int[][] resultMatrix = new int[rowsFirstMatrix][colsSecondMatrix];

        for (int i = 0; i < rowsFirstMatrix; i++) {
            for (int j = 0; j < colsSecondMatrix; j++) {
                for (int k = 0; k < colsFirstMatrix; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        int[][] firstMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] secondMatrix = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

        for (int[] row : resultMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}