import java.util.ArrayList;
public class convertlisttoarray{
	public static void main(String[]args){
		ArrayList languages=new ArrayList<>();
		languages.add("java,python,javascript,PHP,C++,Ruby");
		System.out.println("\n List item:- " +languages);
		String [] array=new String[languages.size()];
		languages.toArray(array);
		System.out.print("\n Array item:-");
		for(String item:array){
			System.out.print(item+ " ");
		}
	} 
}