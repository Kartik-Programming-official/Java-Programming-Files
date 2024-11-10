import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        // Creating a multidimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Using Arrays.deepToString() to convert the multidimensional array to a string
        String arrayString = Arrays.deepToString(matrix);

        // Displaying the string representation of the multidimensional array
        System.out.println("String representation of the multidimensional array:");
        System.out.println(arrayString);
    }
}