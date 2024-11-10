import java.util.Scanner;
public class calculatethepower{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Base:-");
		int base=input.nextInt();
		System.out.print("\n Enter Your Exponent:-");
		int exp=input.nextInt();
		int result=power(base,exp);
		System.out.println(base+" ^ " +exp+ " = "+result);
	}
	public static int power(int base,int exp){
		if(exp!=0){
			return (base*power(base,exp-1));
		}
		return 1;
	}
}