public class ArrayCopyExample{
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Destination array with the same length as the source array
        int[] destinationArray = new int[sourceArray.length];

        // Copying elements from sourceArray to destinationArray
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        // Printing the contents of destinationArray
        System.out.println("Contents of destinationArray:");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
}
