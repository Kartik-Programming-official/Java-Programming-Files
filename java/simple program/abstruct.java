abstract class Bank{
	abstract int getRateofinterest();
}
class SBI extends Bank{
	int getRateofinterest(){return 7;}
}
class PNB extends Bank{
	int getRateofinterest(){return 8;}
}
public class abstruct{
	public static void main(String[]args){
		Bank b;
		b=new SBI();
		System.out.println("\n Rate of interest:- " +b.getRateofinterest()+ "%");
		b=new PNB();
		System.out.println("\n Rate of interest:- " +b.getRateofinterest()+ "%");
	}
}