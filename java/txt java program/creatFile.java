import java.io.File;
import java.io.IOException;
public class creatFile{
	public static void main(String[]args){
		File file=new File("D:\\java\\txt java program\\music.py");
		boolean result;
		try{
			result=file.createNewFile();
			if(result){
				System.out.println("\n File is created in given location:-"+file.getCanonicalPath());
			}else{
				System.out.println("\n File Already exist at location:-"+file.getCanonicalPath());
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}