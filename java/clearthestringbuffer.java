public class clearthestringbuffer{
	public static void main(String[]args){
		StringBuffer str=new StringBuffer();
		str.append("java ");
		str.append(" is ");
		str.append(" popular.");
		System.out.println("\n stringBuffer:- " +str);
		str.delete(0,str.length());
		System.out.println("\n Updated StringBuffer:- " +str);
	}
}