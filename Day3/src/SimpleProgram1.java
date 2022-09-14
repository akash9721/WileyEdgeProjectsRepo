
class DifferentOperation {

	// for loop example
	public static int add(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;

	}

	// while loop
	public static int multi(int n) {
		int multi = 1;
		while (n != 0) {
			multi *= n;
			n--;
		}
		return multi;
	}

	// if else statement
	public static String evenodd(int n) {
		if (n % 2 == 0)
			return "true";
		else {
			return "false";
		}

	}

	// switch case
	public static void weekname(int n) {

		switch (n) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saterday");
			break;
		default:
			System.out.println("none");

		}
	}

	// break and continue
	public static void writenofrom4to8(int n) {
		for (int i = 1; i <= n; i++) {
			if (i < 4)
				continue;
			if (i > 8)
				break;
			System.out.print(i + " ");
		}
	}

}

public class SimpleProgram1 {

	public static void main(String[] args) {
		int n = 10;
		DifferentOperation d = new DifferentOperation();
		System.out.println("Sum of 10 no is: " + d.add(10));
		System.out.println("multiplication from 1 to 5: " + d.multi(5));
		System.out.println("Check even odd: " + d.evenodd(5));
		d.weekname(2);
		d.writenofrom4to8(10);

	}

}
