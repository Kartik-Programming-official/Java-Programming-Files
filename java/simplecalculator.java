import java.util.Scanner;
public class simplecalculator{
	public static void main(String[]args){
		char operator;
		double number1,number2,result;
		Scanner input=new Scanner(System.in);
		System.out.print("\n Choose an operator {+,-,*,%,and /}:-");
		operator=input.next().charAt(0);
		System.out.print("\n Enter Your First Number:-");
		number1=input.nextDouble();
		System.out.print("\n Enter Your Second Number:-");
		number2=input.nextDouble();
		switch(operator){
			case '+':
			result=number1+number2;
			System.out.println(number1+" + " +number2+ "=" +result);
			break;
			case '-':
			result=number1-number2;
			System.out.println(number1+" - " +number2+ "=" +result);
			break;
			case '*':
			result=number1*number2;
			System.out.println(number1+" * " +number2+ "=" +result);
			break;
			case '%':
			result=number1%number2;
			System.out.println(number1+" % " +number2+ "=" +result);
			break;
			case '/':
			result=number1/number2;
			System.out.println(number1+" / " +number2+ "=" +result);
			break;
			default:
			System.out.println("\n Invalid operator!");
			break;
		}
		
	}
}