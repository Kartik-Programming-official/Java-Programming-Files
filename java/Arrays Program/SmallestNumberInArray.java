public class SmallestNumberInArray {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 5, 8, 20, 15};

        // Find the smallest number
        int smallest = findSmallest(array);

        // Print the smallest number
        System.out.println("The smallest number in the array is: " + smallest);
    }

    public static int findSmallest(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }

        // Assume the first element as the smallest
        int smallest = array[0];

        // Iterate through the array to find the smallest number
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Return the smallest number
        return smallest;
    }
}