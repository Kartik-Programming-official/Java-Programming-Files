import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Define an array with duplicate elements
        int[] array = {1, 2, 3, 4, 2, 3, 5};

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        // Print the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        // Sort the array to group duplicate elements together
        Arrays.sort(array);

        // Initialize variables for unique elements and previous element
        int uniqueCount = 1; // at least one unique element (the first one)
        int prev = array[0];

        // Count unique elements and rearrange the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] != prev) {
                array[uniqueCount] = array[i];
                uniqueCount++;
                prev = array[i];
            }
        }

        // Create a new array to hold only unique elements
        int[] uniqueArray = Arrays.copyOf(array, uniqueCount);

        return uniqueArray;
    }
}