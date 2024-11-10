package mypackage;
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
}