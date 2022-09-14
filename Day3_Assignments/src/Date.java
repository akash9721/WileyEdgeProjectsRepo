

public class Date {
	int dd;
	int mm;
	int yy;

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	static boolean isLeap(int year) {
		// handling leap year
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	public boolean checkDate() {

		if (yy > 9999 || yy < 1800)
			return false;

		if (mm < 1 || mm > 12)
			return false;
		if (dd < 1 || dd > 31)
			return false;

		// Handling February month with leap year
		if (mm == 2) {
			if (isLeap(yy))
				return (dd <= 29);
			else
				return (dd <= 28);
		}

		// Handling month which contain 30 days
		if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
			return (dd <= 30);

		return true;

	}

}
