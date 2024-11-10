import java.util.Scanner;
public class countthenumberofvowelconsonentanddigit{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Sentence-");
		String str=input.nextLine();
		int vowel=0,consonant=0,digit=0,space=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			++vowel;
		}else if((ch>='a'&&ch<='z')){
			consonant++;
		}else if((ch>='0'&&ch<='9')){
			++digit;
		}else if(ch==' '){
			space++;
		}
		}
		System.out.println("\n vowel:- " +vowel);
		System.out.println("\n consonant:- " +consonant);
		System.out.println("\n digit:- " +digit);
		System.out.println("\n space:- " +space);
	}
}