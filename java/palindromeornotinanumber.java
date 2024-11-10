import java.util.Scanner;
public class palindromeornotinanumber{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		int num=input.nextInt();
		int rev=0;
		int temp=num;
		while(num!=0){
			int remain=num%10;
			rev=rev*10+remain;
			num /=10;
			}
	if(temp==rev){
		System.out.println(temp+ " is a palindrome.");
	}else{
		System.out.println(temp+ " is not a palindrome.");
		}
	}
}