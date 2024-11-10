class Person{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
}
public class Encapsulate{
	public static void main(String[]args){
		Person person=new Person();
		person.setName("Johan");
		person.setAge(30);
		System.out.println("\n Name:- " +person.getName()+"\n" + "\n Age:- " +person.getAge());
	}
} 