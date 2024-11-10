import java.util.Scanner;
public class factorialofanumber{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		int num=input.nextInt();
		long factorial=multiplynumber(num);
		System.out.println("\n Factorial of " +num+" = " +factorial);
	}
	public static int multiplynumber(int num){
		if(num>=1)
			return (num*multiplynumber(num-1));
		return 1;
	}
}