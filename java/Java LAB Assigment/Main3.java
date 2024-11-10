// Interface representing gross income
interface GrossIncome {
    double calculateGrossIncome();
}

// Employee class representing basic employee details
class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}

// Salary class implementing GrossIncome interface and inheriting from Employee class
class Salary extends Employee implements GrossIncome {
    private double basicSalary;

    public Salary(String name, String designation, double basicSalary) {
        super(name, designation);
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateGrossIncome() {
        // For simplicity, let's assume gross income is basic salary
        return basicSalary;
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Create an instance of Salary
        Salary employee1 = new Salary("John Doe", "Manager", 5000);

        // Display basic employee details
        System.out.println("Name: " + employee1.getName());
        System.out.println("Designation: " + employee1.getDesignation());

        // Calculate and display gross income
        System.out.println("Gross Income: $" + employee1.calculateGrossIncome());
    }
}