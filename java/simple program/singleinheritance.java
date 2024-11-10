class A{
	void a(){
		System.out.println("\n it is class A");
	}
}
class B extends A{
	void b(){
		System.out.println("\n it is class B");
	}
	void a(){
		System.out.println("\n it is class B from class A");
	}
}
public class singleinheritance{
	public static void main(String[]args){
		A s1=new A();
		B s2=new B();
		s1.a();
		//s1.b();->this method show in Error
		s2.a();
		s2.b();
	}
}