interface p{
	final int p=5;
	void dispp();
}
interface p1 extends p{
	final int p1=10;
	void dispp1();
}
interface p2 extends p{
	final int p2=20;
	void dispp2();
}
interface p12 extends p1,p2{
	final int p12=12;
	void dispp12();
}
class Q implements p12{
	public void dispp(){
		System.out.println("\n dispp:- " +p1);
	}
	public void dispp1(){
		System.out.println("\n dispp1:- " +p2);
	}
	public void dispp2(){
		System.out.println("\n dispp2:- " +p12);
	}
	public void dispp12(){
		System.out.println("\n dispp12:- " +p);
	}
}
public class interfaceExample{
	public static void main(String[]args){
		Q q= new Q();
		q.dispp();
		q.dispp1();
		q.dispp2();
		q.dispp12();
	}
}