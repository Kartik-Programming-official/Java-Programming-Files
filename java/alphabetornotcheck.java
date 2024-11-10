import java.util.Scanner;
public class alphabetornotcheck {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Aiphabet:-");
		char ch=input.next().charAt(0);
		String output=(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')
		? ch+ " is an alphabet."
		: ch+ " is not an alphabet.";
		System.out.println(output);
	}
}