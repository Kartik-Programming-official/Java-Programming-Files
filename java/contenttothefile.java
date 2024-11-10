import java.io.Filewriter;
public class contenttothefile{
	public static void main(String[]args){
		String program="class javaFile{"+"public static void main(String[]args)
		{"+Syatem.out.println(\"This is file\");"+ "}"+"}"};
		try {
			FileWriter output=new FileWriter("javaFile.java");
			output.write(program);
			System.out.println("\n Data is written to the file.");
			output.close();
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}
}