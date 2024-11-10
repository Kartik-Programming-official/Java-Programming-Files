import java.util.Scanner;

public class swap {
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n Enter First Number:-");
		float a=sc.nextFloat();
		
		System.out.print("\n Enter Second Number:-");
		float b=sc.nextFloat();
		
		System.out.print("\n ----Before Swaping----");
		System.out.println("\n First Number:-"+a);
		System.out.println("\n Second Number:-"+b);
		
		float temporary=a;
		a=b;
		b=temporary;
		
		System.out.print("\n ----After Swaping----");
		System.out.println("\n First Number:-"+a);
		System.out.println("\n Second Number:-"+b);
	}
}
		
		
		