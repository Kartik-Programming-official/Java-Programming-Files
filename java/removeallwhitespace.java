import java.util.Scanner;
public class removeallwhitespace{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter your String:-");
		String str=input.nextLine();
		System.out.println("\n Orgial String is:- " +str);
		str=str.replaceAll("\\s","");
		System.out.println("\n Final String:- " +str);
		input.close();
	}
}