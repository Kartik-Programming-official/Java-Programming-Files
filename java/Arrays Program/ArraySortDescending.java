import java.util.Arrays;
import java.util.Collections;

public class ArraySortDescending {
    public static void main(String[] args) {
        // Define an array
        Integer[] array = {10, 5, 8, 20, 15};

        // Sort the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}