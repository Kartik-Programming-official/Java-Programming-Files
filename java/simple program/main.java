class student{
	String name;
	int roll;
	int marks;
	void study(){
		System.out.println("\n HE/SHE studied in CST Dept.");
	}
}
class main{
	public static void main(String []args){
		student kartik=new student();
		kartik.name="kartik patra";
		kartik.roll=05;
		kartik.marks=25;
		System.out.println(kartik.name+" " +kartik.roll+" "+kartik.marks);
		kartik.study();
	}
}