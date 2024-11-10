import java.util.Scanner;
public class fibonacci {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Tearm:-");
		int n=input.nextInt();
		System.out.print("\n Fibonacci Series Upto " +n+ " :-");
		int FirstTerm=0,SecondTerm=1;
		while(FirstTerm<=n){
			System.out.print(FirstTerm+ " , ");
			int NextTerm=FirstTerm+SecondTerm;
			FirstTerm=SecondTerm;
			SecondTerm=NextTerm;
		}
	}
}