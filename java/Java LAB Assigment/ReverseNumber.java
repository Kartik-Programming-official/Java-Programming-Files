import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Reverse the digits of the number using a while loop
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}