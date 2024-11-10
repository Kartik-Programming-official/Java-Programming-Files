import mypackage.Calculator;
import java.util.Scanner;
public class calculator{
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		
		Calculator obj=new Calculator();
		
		System.out.print("\n Enter Your First Number:-");
		int x=input.nextInt();
		
		System.out.print("\n Enter Your Second Number:-");
		int y=input.nextInt();
		
		int result=obj.Addition(x,y);
		System.out.println("\n Addition:- "+result);
		
		result=obj.Subtract(x,y);
		System.out.println("\n Subtract:- "+result);
		
		result=obj.Multiplication(x,y);
		System.out.println("\n Multiplication:- "+result);
		
		result=obj.Divition(x,y);
		System.out.println("\n Divition:- "+result);
		
	}
}