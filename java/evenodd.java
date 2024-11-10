import java.util.Scanner;

public class evenodd {
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n Enter Your Number:-");
		int num=sc.nextInt();
		
		String evenodd=(num%2==0)?"Even":"Odd";
		System.out.println(num+ " is " +evenodd+ " Number ");
	}
}