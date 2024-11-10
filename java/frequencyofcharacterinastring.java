import java.util.Scanner;
public class frequencyofcharacterinastring{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Stsring:-");
		String str=input.nextLine();
		System.out.print("\n Enter Your charcter You want check frequency:-");
		char ch=input.next().charAt(0);
		int frequency=0;
		for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i)){
				frequency++;
			}
		}
		System.out.println("Frequency of " +ch+ "= "+frequency);
	}
}