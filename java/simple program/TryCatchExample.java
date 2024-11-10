import java.util.Scanner;
public class TryCatchExample{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your First Number:- ");
		int a=input.nextInt();
		System.out.print("\n Enter Your Second Number:- ");
		int b=input.nextInt();
		try{
			int c=a/b;
			System.out.println("\n Your Answer:- " +c);
		}catch(Exception e){
			System.out.println("\n Does't divided into Zero! \n Pleas Enter Valid Number");
		}
	}
}