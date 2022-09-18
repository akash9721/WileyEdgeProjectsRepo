
public class ExceptionFinallyDemo {

	private static boolean output() {
		try {
			return false;
		} finally {
			return true;
		}
	}

	public static void main(String[] args) {

		System.out.println(output());
//		try {
//			int x = 10;
//			int y = 0;
//			int z = x / y;
//			System.out.println(z);
//		} finally {
//			System.out.println("exception is occured");
//		}
	}
}
