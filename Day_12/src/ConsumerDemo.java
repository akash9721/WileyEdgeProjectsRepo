import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		// using consumer anonymous class
		String str = "akash";
//		Consumer<String> cm = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		};
//		cm.accept(str);

		// using lambda expression
		Consumer<String> con = (data) -> System.out.println("welcome to " + data);
		con.accept(str);
	}

}
