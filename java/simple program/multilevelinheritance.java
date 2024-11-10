class A{
	void a(){
		System.out.println("\n it is class A");
	}
}
class B extends A{
	void b(){
		System.out.println("\n It class B");
	}
}
class C extends B{
	void c(){
		System.out.println("\n it is class C");
	}
}
public class multilevelinheritance{
	public static void main(String[]args){
		A s1=new A();
		B s2=new B();
		C s3=new C();
		s1.a();
		//s1.b();->Error
		//s1.c();->Error
		s2.a();
		s2.b();
		//s2.c();->Error
		s3.a();
		s3.b();
		s3.c();
	}
}