class Student{
	String name;
	int roll;
	void show(String n,int r){
		System.out.println("\n Name:-" +n+ "\n Roll:- " +r);
	}
	void show(int r){
		System.out.println("\n Roll:- " +r);
	}
	void show(String n){
		System.out.println("\n Name:-" +n);
	}
}
public class polymorphism{
	public static void main(String[]args){
		Student s1=new Student();
		s1.name="Arohi";
		s1.roll=28;
		s1.show(s1.name);
		s1.show(s1.name,s1.roll);
		s1.show(s1.roll);
	}
}