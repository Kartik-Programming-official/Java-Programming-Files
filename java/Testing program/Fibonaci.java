class M {
    public static int f(int a, int b, int n) {
        if(n==0){
            return 0;
        }
        int sum = a+b;
        a =b;
        b = sum;
        System.out.print(sum+", ");
        return f(b,sum,n-1);
    }
}
public class Fibonaci extends M{
    
    public static void main(String[] args) {
        int a=0,b=1,n=10;
        System.out.print("0, 1, "+f(a,b,n));
        
    }
    
}