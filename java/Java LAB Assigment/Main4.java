class MyClass {
    private int number;

    // Constructor with parameter
    public MyClass(int number) {
        // Using 'this' keyword to refer to the instance variable
        this.number = number;
    }

    // Method to display the value of instance variable
    public void display() {
        // Using 'this' keyword to refer to the current object's instance variable
        System.out.println("Value of number: " + this.number);
    }

    // Method to update the value of instance variable
    public void setNumber(int number) {
        // Using 'this' keyword to differentiate between instance variable and parameter
        this.number = number;
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass obj = new MyClass(10);

        // Displaying the initial value
        obj.display();

        // Setting a new value
        obj.setNumber(20);

        // Displaying the updated value
        obj.display();
    }
}