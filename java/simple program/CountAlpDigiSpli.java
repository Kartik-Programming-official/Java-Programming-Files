import java.util.Scanner;
public class CountAlpDigiSpli{
	private static Scanner input;
	public static void main(String[]args){
		String str;
		int i,alph,digi,spl;
		alph=digi=spl=0;
		char ch;
		input=new Scanner(System.in);
		System.out.print("\n Please Enter Alpha Numeric special String:-");
		str=input.nextLine();
		for(i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
				alph++;
			}else if(ch>='0'&&ch<='9'){
				digi++;
			}else{
				spl++;
			}
		}
		System.out.println("\n Number of Alphabet Character:- " +alph);
		System.out.println("\n Number of digit Character:- " +digi);
		System.out.println("\n Number of special Character:- " +spl);
	}
}