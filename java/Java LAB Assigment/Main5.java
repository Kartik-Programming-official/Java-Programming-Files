class MyClass {
    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable;

    // Static method
    static void staticMethod() {
        System.out.println("Inside staticMethod()");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Inside instanceMethod()");
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Accessing static variable and method directly using class name
        System.out.println("Value of staticVariable: " + MyClass.staticVariable);
        MyClass.staticMethod();

        // Creating an instance of MyClass
        MyClass obj = new MyClass();

        // Accessing instance variable and method through object
        obj.instanceVariable = 20;
        System.out.println("Value of instanceVariable: " + obj.instanceVariable);
        obj.instanceMethod();
    }
}