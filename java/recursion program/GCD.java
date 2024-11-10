import java.util.Scanner;
public class GCD{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enetr Your First Value:-");
		int n1=input.nextInt();
		System.out.print("\n Enter Your Second Value:-");
		int n2=input.nextInt();
		int hcf=hcf(n1,n2);
		System.out.printf("G.C.D of %d and %d is %d",n1,n2,hcf);
	}
	public static int hcf(int x,int y){
		if(y!=0)
			return (hcf(y,x%y));
		return x;
	}
}