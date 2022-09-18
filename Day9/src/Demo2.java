import java.util.Calendar;

public class Demo2 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println(c.WEEK_OF_MONTH);
		System.out.println(c.WEEK_OF_YEAR);
		System.out.println(c.DATE);
		System.out.println(c.getTime());
	}

}
