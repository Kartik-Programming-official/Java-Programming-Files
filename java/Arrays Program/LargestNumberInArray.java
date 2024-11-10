public class LargestNumberInArray {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 5, 8, 20, 15};

        // Find the largest number
        int largest = findLargest(array);

        // Print the largest number
        System.out.println("The largest number in the array is: " + largest);
    }

    public static int findLargest(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        // Assume the first element as the largest
        int largest = array[0];

        // Iterate through the array to find the largest number
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Return the largest number
        return largest;
    }
}