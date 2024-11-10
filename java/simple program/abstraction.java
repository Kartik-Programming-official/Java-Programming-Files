abstract class animal{
	abstract int leg;
	abstract void run();
	abstract void eat();
}
class dog extends animal{
	public int leg=4;
	public void run(){
		System.out.println("\n Running at the spped of 40km/h");
	}
	public void eat(){
		System.out.println("\n Etting meat.");
	}
}
class octupus extends animal{
	public int leg=8;
	public void run(){
		System.out.println("\n it can be swing.");
	}
	public void eat(){
		System.out.println("\n Eatting Fish.");
	}
}
public class abstraction{
	public static void main(String[]args){
		dog lolo=new dog();
		octupus polo=new octupus();
		System.out.println(lolo.leg+ " " +lolo.run+ " " +lolo.eat);
		System.out.println(polo.leg+ " " +polo.run+ " " +polo.eat);
	}
}