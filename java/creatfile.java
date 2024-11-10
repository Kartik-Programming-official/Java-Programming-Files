import java.io.File;
public class creatfile{
	public static void main(String[]args){
		File file=new File("mypage.java");
		try {
			boolean value=file.createNewFile();
			if(value){
				System.out.println("\n New java File is created.");
			}else{
				System.out.println("\n The File already exists");
			}
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}
}