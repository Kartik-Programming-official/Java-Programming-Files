public class ArrayPrintReverseExample {
    public static void main(String[] args) {
        // Define an array
        int[] array = {1, 2, 3, 4, 5};

        // Print the elements of the array in reverse order
        System.out.println("Elements of the array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
