public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using the add method with two integers
        int result1 = calc.add(5, 10);
        System.out.println("Sum of 5 and 10 is: " + result1);

        // Using the add method with three integers
        int result2 = calc.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15 is: " + result2);
    }
} 