import java.util.Scanner;
public class Armstrongnumbercheck{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Lowest Value:-");
		int low=input.nextInt();
		System.out.print("\n Enter Your Hightest Value:-");
		int high=input.nextInt();
		for(int number=low+1;number<high;++number){
			if(checkArmstrong(number)){
				System.out.print(number+" ");
			}
		}	
	}
		public static boolean checkArmstrong(int num){
			int digit=0,result=0,orgnum;
			orgnum=num;
			while(orgnum!=0){
				orgnum /=10;
				++digit;
			}
			orgnum=num;
			while(orgnum!=0){
				int remainder=orgnum%10;
				result +=Math.pow(remainder,digit);
				orgnum /=10;
			}
			if(result==num)
				return true;
			return false;
		}
}