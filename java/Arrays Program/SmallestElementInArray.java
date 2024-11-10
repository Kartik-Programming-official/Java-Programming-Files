public class SmallestElementInArray {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 20, 5, 25, 30};

        // Assume first element as the smallest
        int smallest = array[0];

        // Iterate through the array to find the smallest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
