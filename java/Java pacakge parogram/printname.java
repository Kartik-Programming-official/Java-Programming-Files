import mypackage.myclass;
import java.util.Scanner;
public class printname{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		System.out.print("\n Enter Your String:-");
		String name=input.nextLine();
		myclass obj= new myclass();
		obj.getName(name);
	}
}