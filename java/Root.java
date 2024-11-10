import java.util.Scanner;

public class Root {
	
	public static void main(String [] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("\n Enter Value of A:-");
		double a=input.nextDouble();
		
		System.out.print("\n Enter Value of B:-");
		double b=input.nextDouble();
		
		System.out.print("\n Enter Value of C:-");
		double c=input.nextDouble();
		
		double root1,root2;
		
		double determinant=b*b-4*a*c;
		
		if(determinant>0){
			
			root1=(-b+Math.sqrt(determinant))/(2*a);
			
			root2=(-b-Math.sqrt(determinant))/(2*a);
			
			System.out.format("\n root1=%.2f and root2=%.2f",root1,root2);
			
		}else if(determinant==0){
			
			root1=root2=-b/(2*a);
			
			System.out.format("\n root1=roo2=%.2f",root1);
			
		}else{
			double real=-b/(2*a);
			
			double imaginary=Math.sqrt(-determinant)/(2*a);
			
			System.out.format("\n root1=%.2f + %.2fi",real,imaginary);
			
			System.out.format("\n root2=%.2f - %.2fi",real,imaginary);
			
		}
			
		}
	}