public class SubtractMatrices {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Subtract the matrices
        int[][] differenceMatrix = subtractMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant Matrix:");
        displayMatrix(differenceMatrix);
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Matrices are not of the same size. Subtraction cannot be performed.");
            return null;
        }

        int[][] difference = new int[rows1][columns1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return difference;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}