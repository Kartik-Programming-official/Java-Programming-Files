import java.util.Random;
public class randomstring{
	public static void main(String[]args){
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb=new StringBuilder();
		Random random=new Random();
		int length=7;
		for(int i=0;i<length;i++){
			int index=random.nextInt(alphabet.length());
			char randomchar=alphabet.charAt(index);
			sb.append(randomchar);
		}
		String randomstring=sb.toString();
		System.out.println("\n Random String is:- " +randomstring);
	}
}