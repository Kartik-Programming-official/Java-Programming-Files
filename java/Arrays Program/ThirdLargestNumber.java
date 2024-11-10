import java.util.Arrays;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 5, 8, 20, 15};

        // Find the 3rd largest number
        int thirdLargest = findThirdLargest(array);

        // Print the 3rd largest number
        System.out.println("The third largest number in the array is: " + thirdLargest);
    }

    public static int findThirdLargest(int[] array) {
        if (array.length < 3) {
            System.out.println("Array length should be at least 3");
            return -1;
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Return the 3rd largest number
        return array[array.length - 3];
    }
}