import java.util.Scanner;
public class multiplicationtable{
	public static void main(String[]arges){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your number:-");
		int num=input.nextInt();
		System.out.print("\n Enter Your last term you print multiplication table:-");
		int last=input.nextInt();
		for(int i=0;i<=last;++i){
			System.out.printf("\n %d*%d=%d \n",num,i,num*i);
		}
		
	}
}