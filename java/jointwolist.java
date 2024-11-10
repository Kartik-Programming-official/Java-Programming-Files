import java.util.ArrayList;
import java.util.List;
public class jointwolist{
	public static void main(String[]args){
		List<String>list1=new ArrayList<String>();
		list1.add("a,b,c");
		List<String>list2=new ArrayList<String>();
		list2.add("d,e,f");
		List<String>joined=new ArrayList<String>();
		joined.addAll(list1);
		joined.addAll(list2);
		System.out.println("\n List one:- " +list1);
		System.out.println("\n List two:- " +list2);
		System.out.println("\n Joined List:- " +joined);
	}
}