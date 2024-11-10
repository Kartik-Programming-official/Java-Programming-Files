import java.io.FileOutputStream;
import java.util.Scanner;
public class CreatNewFile{
	public static void main(String[]args){
		try{
			Scanner input=new Scanner(System.in);
			System.out.print("\n Enter File Name:-");
			String name=input.nextLine();
			FileOutputStream fos=new FileOutputStream(name,true);
			System.out.print("\n Enter File Content:-");
			String str=input.nextLine();
			byte[] b=str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("\n File Saved.");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}