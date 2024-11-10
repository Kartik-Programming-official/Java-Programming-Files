import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class convertstringtodate{
	public static void main(String[]args){
		String string="january 25,2024";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("\n MMMM d, yyyy",Locale.ENGLISH);
		LocalDate date=LocalDate.parse(string,formatter);
		System.out.println(date);
	}
}