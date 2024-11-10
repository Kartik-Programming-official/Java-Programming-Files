package mypackage;
public class Calculator{
	public int Addition(int a, int b){
		return a+b;
	}
	public int Subtract(int a, int b){
		return a-b;
	}
	public int Multiplication(int a, int b){
		return a*b;
	}
	public int Divition(int a, int b){
		if(b!=0){
			return a/b;
		}
		else{
			throw new ArithmeticException("can not divide by Zero!");
		}
	}
}