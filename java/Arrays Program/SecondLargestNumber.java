import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 5, 8, 20, 15};

        // Find the 2nd largest number
        int secondLargest = findSecondLargest(array);

        // Print the 2nd largest number
        System.out.println("The second largest number in the array is: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array length should be at least 2");
            return -1;
        }

        // Sort the array in descending order
        Arrays.sort(array);

        // Return the 2nd largest number
        return array[array.length - 2];
    }
}