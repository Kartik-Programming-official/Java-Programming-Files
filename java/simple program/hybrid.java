class HumanBody{
	public void displayHuman(){
		System.out.println("\n it is HumanBody class.");
	}
}
interface Male{
	public void show();
}
interface Female{
	public void show();
}
class Child extends HumanBody implements Male,Female{
	public void show(){
		System.out.println("\n it is male femal class.");
	}
	public void displayChild(){
		System.out.println("\n it is child class.");
	}
}
public class hybrid{
	public static void main(String[]args){
		Child obj=new Child();
		obj.show();
		obj.displayChild();
		obj.displayHuman();
	}
}