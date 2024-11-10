import java.util.ArrayList;
import java.util.List;
public class mergetwolists{
	public static void main(String[]args){
		List<Integer>prime=new ArrayList<>();
		prime.add(1);
		prime.add(2);
		prime.add(3);
		prime.add(4);
		prime.add(5);
		System.out.println("\n First List:- " +prime);
		List<Integer>even=new ArrayList<>();
		even.add(6);
		even.add(7);
		even.add(8);
		even.add(9);
		even.add(10);
		System.out.println("\n Second List:- " +even);
		List<Integer>number=new ArrayList<>();
		number.addAll(prime);
		number.addAll(even);
		System.out.println("\n merged List:- " +number);
	}
}