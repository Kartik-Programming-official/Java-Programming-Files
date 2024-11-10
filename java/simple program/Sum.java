public class Sum{
	int a,b;
	Sum(int a,int b){
		this.a=a;
		this.b=b;
	}
	void Display(){
		System.out.println(a+b);
	}
	public static void main(String[]args){
		Sum c= new Sum(100,200);
		c.Display();
	}
}