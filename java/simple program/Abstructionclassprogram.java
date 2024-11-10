abstract class Animal{
	//abstract int leg;
	abstract void run();
	abstract void eat();
}
class dog extends Animal{
	//public int leg=4;
	public void run(){
		System.out.println("\n Running at the speed of 40km/h");
	}
	public void eat(){
		System.out.println("\n Dog eatting Meat");
	}
}
class octupus extends Animal{
	//public int leg=8;
	public void run(){
		System.out.println("\n it can not run it cal swing");
	}
	public void eat(){
		System.out.println("\n Octupus eatting fish");
	}
}
public class Abstructionclassprogram{
	public static void main(String[]args){
		dog lolo= new dog();
		octupus polo= new octupus();
		//lolo.leg;
		lolo.run();
		lolo.eat();
		//polo.leg;
		polo.run();
		polo.eat();
	}
}