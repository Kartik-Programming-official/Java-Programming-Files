import java.util.Scanner;

public class QuotientRemainder {
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n Enter dividend:-");
		int Quotient=sc.nextInt();
		
		System.out.print("\n Enter Divisor:-");
		int Remainder=sc.nextInt();
		
		int a=Quotient/Remainder;
		
		int b=Quotient%Remainder;
		
		System.out.println("\n Quotient="+a);
		
		System.out.println("\n Quotient="+b);
		
	}
}