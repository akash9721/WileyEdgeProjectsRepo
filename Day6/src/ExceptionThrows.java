
public class ExceptionThrows {

	private static void exception() throws InterruptedException, ArithmeticException {

		Thread.sleep(1000);
		System.out.println("solved");
		int x = 10;
		int y = 0;
		System.out.println(x / y);

	}

	public static void main(String[] args) throws InterruptedException, ArithmeticException {
		exception();

	}

}
