class Maths_f {
	public static int fact(int n) {
		if(n>=1)
			return n*fact(n-1);
		return 1;
		
		}
	}

class Factorial /*extends Maths_f*/{
public static void main(String [] args) {
int n=5;
//long Fact=fact(n);
System.out.println("\n Factorial number is:- "+Maths_f.fact(n));
}
}