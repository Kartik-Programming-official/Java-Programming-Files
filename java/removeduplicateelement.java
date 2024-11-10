import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashset;
import java.util.Set;
public class removeduplicateelement{
	public static void main(String[]args){
		ArrayList<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,5,8,4,6,9,7));
		System.out.println("\n ArrayList With duplicate elements:- " +numbers);
		Set<Integer>set=new LinkedHashset <>();
		set.addAll(numbers);
		numbers.clear();
		numbers.addAll(set);
		System.out.println("\n ArrayList without duplicate element:- " +numbers);
	}
}