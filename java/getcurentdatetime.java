import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class getcurentdatetime{
	public static void main(String[]args){
		LocalDateTime current=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("\n YYY-MM-dd HH:mm:ss.sss");
		String formatted=current.format(format);
		System.out.println("\n current date and time is:- "+formatted);
	}
}