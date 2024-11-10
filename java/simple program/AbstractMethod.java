abstract class Multiply{
	public abstract int MultiplyTwo(int n1,int n2);
	public abstract int MultiplyThree(int num1,int num2,int num3);
	
	public void show(){
		System.out.println("\n Method of abstract class Multiply.");
	}
}
class myclass extends Multiply{
	public int MultiplyTwo(int num1,int num2){
		return num1*num2;
	}
	public int MultiplyThree(int num1,int num2,int num3){
		return num1*num2*num3;
	}
}
public class AbstractMethod{
	public static void main(String[]args){
		myclass object= new myclass();
		System.out.println("\n Multiplication of two number:- " +object.MultiplyTwo(10,50));
		System.out.println("\n Multiplication of three number:- " +object.MultiplyThree(5,8,10));
		object.show();
	}
}