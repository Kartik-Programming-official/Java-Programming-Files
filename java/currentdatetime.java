import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class currentdatetime {
	public static void main(String[]args){
		LocalDateTime current=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String formatted=current.format(formatter);
		System.out.println("\n Current Date is:-"+formatted);
	}
}