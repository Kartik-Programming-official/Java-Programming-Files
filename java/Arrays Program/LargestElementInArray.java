public class LargestElementInArray {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 20, 5, 25, 30};

        // Assume first element as the largest
        int largest = array[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
