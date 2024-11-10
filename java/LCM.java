import java.util.Scanner;
public class LCM{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter First Term:-");
		int n1=input.nextInt();
		System.out.print("\n Enter Second Term:-");
		int n2=input.nextInt();
		int lcm=(n1>n2)? n1:n2;
		while(true){
			if(lcm%n1==0&&lcm%n2==0){
				System.out.printf("\n The LCM of %d and %d is:-%d",n1,n2,lcm);
				break;
			}
			++lcm;
		}
	}
}