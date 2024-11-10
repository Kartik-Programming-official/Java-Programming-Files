import java.util.Scanner;
public class displayprimenumberbetweentwointervals {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Lowest value you can print prime number:-");
		int low=input.nextInt();
		System.out.print("\n Enter Your Highist Value You can print prime number:-");
		int high=input.nextInt();
		while(low<=high){
			boolean flag=false;
			for(int i=2;i<=low/2;++i){
				if(low%i==0){
					flag=true;
					break;
				}
			}
			if(!flag&&low!=0&&low!=1){
				System.out.print(low+ " ");
			}
		  ++low;
		}
	}
}