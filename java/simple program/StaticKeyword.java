import java.util.Scanner;
public class StaticKeyword{
	public static int Multiply(int a,int b){
		return a*b;
	}
	public static int Multiply(int a, int b, int c){
		return a*b*c;
	}
	public int Divition(int a, int b){
		try{
		int C=a/b;
		System.out.println("\n A/B= "+C);
	}catch(Exception e){
		System.out.println("\n Can not divided into Zero please enter valid number of B");
		System.out.println("\n Rest the code!");
		}
		return 0;
	}
		public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		StaticKeyword object=new StaticKeyword();
		System.out.print("\n Enter the value of a:- ");
        int x=input.nextInt();
		System.out.print("\n Enter the value of b:- ");
		int y=input.nextInt();
		System.out.print("\n Enter the value of c:- ");
		int z=input.nextInt();
		System.out.print("\n Enter the divition First value:- ");
		int A=input.nextInt();
		System.out.print("\n Enter the divition Second value:- ");
		int B=input.nextInt();
		System.out.println("\n a*b= " +Multiply(x,y));
		System.out.println("\n a*b*c= " +Multiply(x,y,z));
		object.Divition(A,B);
	}
}