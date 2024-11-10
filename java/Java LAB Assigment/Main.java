class Person {
    String name;

    // Constructor to initialize the name of the person
    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int employeeId;

    // Constructor to initialize both the name and the employeeId
    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Employee and display its details
        Employee employee = new Employee("John", 1001);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee ID: " + employee.employeeId);
    }
}