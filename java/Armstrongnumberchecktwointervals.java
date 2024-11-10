import java.util.Scanner;
public class Armstrongnumberchecktwointervals{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your lowest value you can check armstorn number:-");
		int low=input.nextInt();
		System.out.print("\n Enter Your highest value you can check armstorn number:-");
		int high=input.nextInt();
		int num;
		for(num=low+1;num<high;++num){
			int digits=0;
			int result=0;
			int orgnum=num;
			while(orgnum!=0){
				orgnum /=10;
				++digits;
			}
			orgnum=num;
			while(orgnum!=0){
				int remainder=orgnum%10;
				result +=Math.pow(remainder,digits);
				orgnum /=10;
			}
			if(result==num){
			System.out.print(num+ " ");
			}
		}
	}
}