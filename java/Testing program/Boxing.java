public class Boxing{
	public static void main(String [] args){
		int a= 4;
        Integer k =Integer.valueOf(a); //boxing
        System.out.println(k);
        Integer m = new Integer(41);
        float g = m.floatvalue();//unboxing
        System.out.println(g);
    }
}