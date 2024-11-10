class A{
	void a(){
		System.out.println("\n cat");
	}
}
interface B{
	void b();
}
interface C {
	void c();
}
class D extends A implements B,C {
	public void b(){
		System.out.println("\n Dog");
	}
	public void c(){
		System.out.println("\n cow");
	}
	void d(){
		System.out.println("\n ass");
	}
}
public class hybridinheritance{
	public static void main(String[]args){
		D input= new D();
		input.a();
		input.b();
		input.c();
		input.d();
	}
}