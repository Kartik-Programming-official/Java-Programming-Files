class Animal{
	String color="White";
}
class Dog extends Animal{
	String color="Black";
	void PrintColor(){
		System.out.println(color);
        System.out.println(super.color);		
	}
}
public class SuperKeywordEx1{
	public static void main(String[]args){
		Dog object=new Dog();
		object.PrintColor();
	}
}