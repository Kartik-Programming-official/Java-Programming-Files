import java.util.Scanner;
public class palindromornotinstring {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your String:-");
		String str=input.nextLine();
		String reverse="";
		int length=str.length();
		for(int i=length-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse)){
			System.out.println(str+ " is a palindrome String.");
		}else{
			System.out.println(str+ " is not a palindrome String.");
		}
	}
}