import java.util.Scanner;

public class relational {
	
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("\n Enter Valu Of A= ");
		double a=input.nextDouble();
		
		System.out.print("\n Enter Valu Of B= ");
		double b=input.nextDouble();
		
		System.out.print("\n Enter Valu Of C= ");
		double c=input.nextDouble();
		
		System.out.println("\n A= "+a);
		
		System.out.println("\n B= "+b);
		
		System.out.println("\n C= "+c);
		
		System.out.println("\n A<B is  "+(a<b));
		
		System.out.println("\n A>B is  "+(a>b));
		
		System.out.println("\n A==C is  "+(a==c));
		
		System.out.println("\n A<=C is  "+(a<=c));
		
		System.out.println("\n A>=B is  "+(a>=b));
		
		System.out.println("\n B!=C is  "+(b!=c));
		
		System.out.println("\n B==a+c is  "+(b==a+c));
	}
}