abstract class Animal{
	public abstract void eatten();
	public abstract void run();
}
class Tiger extends Animal{
	@Override
	public void eatten(){
		System.out.println("\n Tiger eat meat.");
	}
	@Override
	public void run(){
		System.out.println("\n Tiger run 45km/h.");
	}
}
class Dog extends Animal{
	@Override
	public void eatten(){
		System.out.println("\n Dog eat meat.");
	}
	@Override
	public void run(){
		System.out.println("\n Dog run 30km/h.");
	}
}
class Cow extends Animal{
	@Override
	public void eatten(){
		System.out.println("\n Cow eat grass.");
	}
	@Override
	public void run(){
		System.out.println("\n Cow run 10km/h.");
	}
}
public class ABSTRACT{
	public static void main(String[]args){
		Tiger tiger= new Tiger();
		tiger.eatten();
		tiger.run();
		
		System.out.println();
		
		Dog dog= new Dog();
		dog.eatten();
		dog.run();
		
		System.out.println();
		
		Cow cow= new Cow();
		cow.eatten();
		cow.run();
		
		System.out.println();
	}
}