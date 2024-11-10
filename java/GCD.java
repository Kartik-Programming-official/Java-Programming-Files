import java.util.Scanner;
public class GCD {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Ener First Term:-");
		int n1=input.nextInt();
		System.out.print("\n Enter Second Term:-");
		int n2=input.nextInt();
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;++i){
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
		System.out.println("\n G.C.D of " +n1+ " and " +n2+ " is:- " +gcd);
	}
}