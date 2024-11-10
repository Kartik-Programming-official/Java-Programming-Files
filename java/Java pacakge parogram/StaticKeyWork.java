import mypackage.StaticKeyword;

import java.util.Scanner;
public class StaticKeyWork extends StaticKeyword{
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		StaticKeyword object=new StaticKeyword();
		
		System.out.print("\n Enter the value of a:- ");
        int x=input.nextInt();
		System.out.print("\n Enter the value of b:- ");
		int y=input.nextInt();
		System.out.println("\n a*b= " +Multiply(x,y));
		
		System.out.print("\n Enter the value of c:- ");
		int z=input.nextInt();
		System.out.println("\n a*b*c= " +Multiply(x,y,z));
		
		System.out.print("\n Enter the divition First value:- ");
		int A=input.nextInt();
		System.out.print("\n Enter the divition Second value:- ");
		int B=input.nextInt();
		object.Divition(A,B);
		}
}