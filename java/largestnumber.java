import java.util.Scanner;

public class largestnumber {
	
	public static void main(String [] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("\n Enter Your First Number:-");
		int a=input.nextInt();
		
		System.out.print("\n Enter Your Second Number:-");
		int b=input.nextInt();
		
		System.out.print("\n Enter Your Third Number:-");
		int c=input.nextInt();
		
		if(a>=b&&a>=c){
			System.out.println(a+ " is The Largest Number. ");
			
		}else if(b>=a&&b>=c){
			System.out.println(b+ " is The Largest Number. ");
			
		}else{
			System.out.println(c+ " is The Largest Number. ");
		}
	}
}