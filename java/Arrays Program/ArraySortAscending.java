import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 5, 8, 20, 15};

        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}