
interface ABC {
	void show();
}
//
//class showMethod implements ABC {
//
//	@Override
//	public void show() {
//		System.out.println("displya the content");
//	}
//
//}

public class FunctionalInterfaceDemo2 {
	public static void main(String[] args) {
//		ABC abc;
//		abc = new ABC() {
//
//			@Override
//			public void show() {
//				System.out.println("hellow");
//			}
//
//		};
//		abc.show();

		ABC ab = () -> System.out.println("heloo");
		ab.show();

	}

}
