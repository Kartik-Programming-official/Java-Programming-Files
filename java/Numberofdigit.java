import java.util.Scanner;
public class Numberofdigit {
	public static void main(String[]args){
		int count=0;
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Digits:-");
		int num=input.nextInt();
		while(num!=0){
			num /=10;
			++count;
		}
		System.out.println("\n Number of digits:-"+count);
	}
}