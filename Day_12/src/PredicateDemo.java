import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		// using predicate anonymous class
		String str = "Akashkumar";
//		Predicate<String> pc = new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.length() < 10;
//			}
//		};
//		System.out.println(pc.test(str));

		// using lambda function
		Predicate<String> pc = (data) -> data.length() < 10;
		System.out.println(pc.test(str));
	}

}
