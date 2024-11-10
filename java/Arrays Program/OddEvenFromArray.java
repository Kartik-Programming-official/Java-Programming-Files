public class OddEvenFromArray {
    public static void main(String[] args) {
        // Define an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print odd and even numbers from the array
        System.out.println("Odd numbers:");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nEven numbers:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}