import java.math.BigInteger;
import java.util.Scanner;
public class Factorial{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		int num=input.nextInt();
		BigInteger factorial=BigInteger.ONE;
		for(int i=1;i<=num;++i){
			factorial=factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.printf("\n Factorial Of %d = %d",num,factorial);
	}
}