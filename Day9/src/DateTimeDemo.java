import java.time.LocalDate;
import java.util.Date;

public class DateTimeDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfWeek());
		// System.out.println(ld.getDayOfYear());
		System.out.println(ld.getYear());
		System.out.println(ld.lengthOfMonth());
		System.out.println(ld.lengthOfYear());
		System.out.println(ld.ofYearDay(2022, 32));
		System.out.println(ld.of(2022, 9, 16));
	}

}
