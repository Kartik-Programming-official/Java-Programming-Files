import java.util.Scanner;
public class primeornot {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		int num=input.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;++i){
			if(num%i==0){
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(num+" is a prime Number.");
		}else{
			System.out.println(num+ " is not a prime Number.");
		}
	}
}