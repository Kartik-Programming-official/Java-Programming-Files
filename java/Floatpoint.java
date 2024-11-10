import java.util.Scanner;

class Floatpoint
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n A=");
		int a=sc.nextInt();
		
		System.out.println("\n B=");
		int b=sc.nextInt();
		
		System.out.println("\n A= " +a);
		
		System.out.println("\n B= " +b);
		
		System.out.println("A+B= " +(a+b));
		
		System.out.println("A-B= " +(a-b));
		
		System.out.println("A*B= " +(a*b));
		
		System.out.println("A/B= " +(a/b));
		
		System.out.println("A%B= " +(a%b));
	}
}