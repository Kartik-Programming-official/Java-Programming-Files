import java.util.Scanner;
public class Reversenumber{
	public static void main(String[]args){
		int rev=0;
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		int num=input.nextInt();
		for(;num!=0;num /=10){
			int digit=num%10;
			rev=rev*10+digit;
		}
		System.out.println("\n Reverse Number= "+rev);
	}
}