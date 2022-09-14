

public class ValidateDate {
	public static void main(String[] args) {
		Date d = new Date(30, 12, 2022);
		if (d.checkDate())
			System.out.println("Date is Valid");
		else {
			System.out.println("Date is not Valid");
		}

	}

}
