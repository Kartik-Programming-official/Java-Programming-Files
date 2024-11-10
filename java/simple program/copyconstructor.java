import java.util.Scanner;
public class copyconstructor{
	private int rollnumber;
	private String name;
	private int age;
	public copyconstructor(String name,int rollnumber,int age){
		this.rollnumber=rollnumber;
		this.name=name;
		this.age=age;
	}
	public copyconstructor(copyconstructor student){
		this.rollnumber=student.rollnumber;
		this.name=student.name;
		this.age=student.age;
	}
	public void display(){
		System.out.println("\n Roll Number:- " +this.rollnumber);
		System.out.println("\n Name:- " +this.name);
		System.out.println("\n Age:- " +this.age);
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n Enter Your Name:-");
		String name=input.nextLine();
		System.out.print("\n Enter Your Roll Number:-");
		int roll_number=input.nextInt();
		System.out.print("\n Enter Your Age:- ");
		int age=input.nextInt();
		copyconstructor student=new copyconstructor(name,roll_number,age);
		System.out.println("\n contents of the original object:-");
		student.display();
		copyconstructor student_copy=new copyconstructor(student);
		System.out.println("\n contents of the copy object:-");
		student.display();
	}
}