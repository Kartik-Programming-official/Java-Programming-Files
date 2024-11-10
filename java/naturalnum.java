import java.util.Scanner;
public class naturalnum {
	public static void main(String[]args){
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number;-");
		int num=input.nextInt();
		for(int i=1;i<=num;++i){
			sum +=i;
		}
		System.out.println("\n sum= "+sum);
	}
}