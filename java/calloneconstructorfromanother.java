public class calloneconstructorfromanother{
	int sum;
	calloneconstructorfromanother(){
		this(5,2);
	}
	calloneconstructorfromanother(int arg1,int arg2){
		this.sum=arg1+arg2;
	}
	void display(){
		System.out.println(" \n sum is:- " +sum);
	}
	public static void main(String[]args){
		calloneconstructorfromanother obj=new calloneconstructorfromanother();
		obj.display();
	}
}