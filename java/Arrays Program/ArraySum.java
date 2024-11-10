public class ArraySum {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 20, 30, 40, 50};

        // Initialize sum variable to store the sum
        int sum = 0;

        // Calculate the sum of all elements in the array
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Print the sum
        System.out.println("Sum of all elements in the array: " + sum);
    }
}