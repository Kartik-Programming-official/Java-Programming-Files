class Animal{
	void eat(){
		System.out.println("\n Eating......");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("\n Eating bread......");
	}
	void bark(){
		System.out.println("\n Barking......");
	}
	void work(){
		super.eat();
		eat();
		bark();
	}
}
public class SuperKeywordEx2{
	public static void main(String[]args){
		Dog object=new Dog();
		object.work();
	}
}