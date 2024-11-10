import java.util.Scanner;
public class reversesentence{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Sentence:-");
		String str=input.nextLine();
		String rev=rev(str);
		System.out.println("\n Reverse Sentence is :- " +rev);
	}
	public static String rev(String x){
		if(x.isEmpty())
			return x;
		return rev(x.substring(1))+x.charAt(0);
	}
}