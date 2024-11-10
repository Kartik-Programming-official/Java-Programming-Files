import java.util.Arrays;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 5, 8, 20, 15};

        // Find the 2nd smallest number
        int secondSmallest = findSecondSmallest(array);

        // Print the 2nd smallest number
        System.out.println("The second smallest number in the array is: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array length should be at least 2");
            return -1;
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Return the 2nd smallest number
        return array[1];
    }
}