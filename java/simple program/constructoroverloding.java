public class constructoroverloding{
	int id;
	String name;
	constructoroverloding(){System.out.println("\n this a default constructor");}
	constructoroverloding(int i,String n){
		id=i;
		name=n;
	}
	public static void main(String args[]){
		constructoroverloding s=new constructoroverloding();
		System.out.println("\n default constructor value:-");
		System.out.println("\n Student id:- " +s.id+ "\n Student Name:- " +s.name);
		System.out.println("\n paramitarize constructor value:-");
		constructoroverloding student=new constructoroverloding(908323,"Raju");
		System.out.println("\n Student id:- " +student.id+ "\n Student Name:- " +student.name);
	}
}