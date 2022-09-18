
public class TryCatchFinallyDemo {

	private static String method(String string) {
		try {

		} catch (Exception e) {

		} finally {
			return string;
		}
	}

	static int methodReturningValue() {
		try {
			return 10; // control will not be passed to main() method here
		} catch (Exception e) {
			return 20; // Control will not be passed to main() method here
		} finally {
			System.out.println("finally block is always executed");

			// Control will be passed to main() method after executing this block
		}
	}

	static String methodReturningValue1() {
		String s = null;
		try {
			s = "return value from try block";
			return s;
		} catch (Exception e) {
			s = s + "return value from catch block";
			return s;
		} finally {
			s = s + "return value from finally block";
			return s;
		}
	}

	static int methodReturningValue2() {
		int i = 0;
		try {
			i = 1;
			return i;
		} catch (Exception e) {
			i = 2;
			return i;
		} finally {
			i = 3;
		}
	}

	static int methodReturningValue3() {
		int i = 0;

		try {
			i = 1;
			return i;
		} catch (Exception e) {
			i = 2;
		} finally {
			i = 3;
		}

		return i;
	}

	public static void main(String[] args) {

		// System.out.println(method("string passed"));
		// System.out.println(methodReturningValue());
		// System.out.println(methodReturningValue1());
		// System.out.println(methodReturningValue2());
		System.out.println(methodReturningValue3());
	}

}
