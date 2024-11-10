import java.util.Scanner;
public class numbercanbeexpressedassum{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		int num=input.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;i++){
			if(checkprime(i)){
				if(checkprime(num-i)){
					System.out.printf("\n %d=%d+%d \n",num,i,num-i);
					flag=true;
				}
			}
		}
		if(!flag){
			System.out.println(num+" can not be expressed as the sum of two prime numbers.");
		}
	}
	public static boolean checkprime(int num){
		boolean isprime=true;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isprime=false;
				break;
			}
		}
		return isprime;
	}
}