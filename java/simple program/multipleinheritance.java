interface A{
	void a();
}
interface B{
	void b();
}
class C implements A,B{
	void c(){
		System.out.println("\n it is class C");
	}
	public void a(){
		System.out.println("\n it is class A");
	}
	public void b(){
		System.out.println("\n it is class B");
	}
}
public class multipleinheritance{
	public static void main(String[]args){
		C input= new C();
		input.a();
		input.b();
		input.c();
	}
}