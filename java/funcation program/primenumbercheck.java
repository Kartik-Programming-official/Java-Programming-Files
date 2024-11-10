import java.util.Scanner;
public class primenumbercheck {
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your lowest value:-");
		int low=input.nextInt();
		System.out.print("\n Enter Your highest value:-");
		int high=input.nextInt();
		while(low<high){
			if(checkprimenumber(low))
				System.out.print(low+ " ");
			++low;
		}
	}
	public static boolean checkprimenumber(int num){
		boolean flag=true;
		for(int i=2;i<=num/2;++i){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}