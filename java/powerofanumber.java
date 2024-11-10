import java.util.Scanner;
public class powerofanumber{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Base:-");
		int base=input.nextInt();
		System.out.print("\n Enter Your Exponent:-");
		int exp=input.nextInt();
		double result=Math.pow(base,exp);
		System.out.println("\n Answer= " +result);
	}
}