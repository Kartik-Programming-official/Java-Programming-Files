import java.util.Scanner;
public class comparetwostring{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your First String:-");
		String str=input.nextLine();
		System.out.print("\n Enter Your Second String:-");
		String STR=input.nextLine();
		if(str.equals(STR)){
			System.out.println("\n Two String are Equals");
		}else{
			System.out.println("\n Two String are not Equals");
		}
	}
}