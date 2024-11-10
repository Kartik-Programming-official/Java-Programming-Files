class MultiNaming extends Thread{
	public void run(){
		System.out.println("\n Running.......");
	}
	public static void main(String[]args){
		MultiNaming t1= new MultiNaming();
		MultiNaming t2=new MultiNaming();
		t1.start();
		System.out.println("\n Name of t1:- "+t1.getName());
		t1.setName("Payel");
		System.out.println("\n After Changing name of t1:- " +t1.getName());
		t2.start();
		System.out.println("\n Name of t2:- " +t2.getName());
		t2.setName("Kartik");
		System.out.println("\n After Changing Name of t2:- " +t2.getName());
	}
}