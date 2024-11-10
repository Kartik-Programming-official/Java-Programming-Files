import java.util.Scanner;
public class halfpyramidusingstar{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.print("\n Enter Row Number:-");
	int row=input.nextInt();
	for(int i=1;i<=row;i++){
		for(int j=1;j<=i;++j){
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}