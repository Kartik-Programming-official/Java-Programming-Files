public class ArrayPrintEvenPositionExample {
    public static void main(String[] args) {
        // Define an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print the elements of the array present at even positions
        System.out.println("Elements of the array present at even positions:");
        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}