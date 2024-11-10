class Animal{
	Animal(){
		System.out.println("\n Animal is created");
	}
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("\n Dog is created");
	}
}
public class SuperKeywordEx3{
	public static void main(String[]args){
		Dog object=new Dog();
	}
}