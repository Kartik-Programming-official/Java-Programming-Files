// Save as Main.java in the parent directory
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Length of Rectangle:- ");
		double a=input.nextDouble();
		System.out.print("\n Enter Width of Rectangle:- ");
		double b=input.nextDouble();
        mypackage.Rectangle rectangle = new mypackage.Rectangle(a, b);
        System.out.println("\n Area of the rectangle:- " + rectangle.calculateArea());
        System.out.println("\n Perimeter of the rectangle:- " + rectangle.calculatePerimeter());
    }
}
