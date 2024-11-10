class Shape{
	String color;
	Shape(String color){
		this.color=color;
	}
	void draw(){
		System.out.println("\n Drawing A shape with color:- " +color);
	}
}
class Circle extends Shape{
	double radious;
	Circle(String color,double radious){
		super(color);
		this.radious=radious;
	}
	double CalculateArea(){
		return Math.PI*radious*radious;
	}
}
public class InheritansExample{
	public static void main(String[]args){
		Circle circle = new Circle("Red",5.0);
        circle.draw();
        System.out.println("\n Area of the circle:- " +circle.CalculateArea());		
	}
}