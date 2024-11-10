import mypackage.Person;
public class Encapsulation{
	public static void main(String[]args){
		Person person=new Person();
		/*person.setName("Johan");
		person.setAge(30);
		System.out.println("\n Name:- " +person.getName()+"\n" + "\n Age:- " +person.getAge());*/
		person.setAcc_no(455986562556L);
        person.setName("kartik");
        person.setEmail("kartikpatra@gmail.com");
        person.setAmmount(50000f);
        System.out.println(person.getAcc_no()+ " " +person.getName()+ 
		" " +person.getEmail()+ " " +person.getAmmount());
	}
}