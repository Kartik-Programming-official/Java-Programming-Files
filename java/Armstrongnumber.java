import java.util.Scanner;
public class Armstrongnumber{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		int num=input.nextInt();
		int orgnum,remain,result=0;
		orgnum=num;
		while(orgnum!=0){
			remain=orgnum%10;
			result +=Math.pow(remain,3);
			orgnum /=10;
		}
		if(result==num){
			System.out.println(num+ " is a Armstrong Number.");
		}else{
			System.out.println(num+ " is not a Armstrong Number.");
		}
	}
}