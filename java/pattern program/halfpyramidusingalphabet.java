import java.util.Scanner;
public class halfpyramidusingalphabet{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	System.out.print("\n Enter your first alphabet:-");
	char alphabet=input.next().charAt(0);
	System.out.print("\n Enter Your Last alphabet:-");
	char last=input.next().charAt(0);
	for(int i=1;i<=(last-'A'+1);++i){
		for(int j=1;j<=i;++j){
			System.out.print(alphabet+" ");
		}
		++alphabet;
		System.out.println();
	}
	}
}