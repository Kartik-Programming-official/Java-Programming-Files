import java.util.Scanner;
public class positivenegative {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Number:-");
		double num=input.nextDouble();
		if(num<0.0){
			System.out.println(num+ " is a negative number.");
		}else if(num>0.0){
			System.out.println(num+ " is a positive number.");
		}else{
			System.out.println(num+ " is 0.");
		}
	}
}