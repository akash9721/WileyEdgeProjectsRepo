public class FIDemo {
	public static void main(String[] args) {
		// anonymous class method
//		FunctionalInterfaceDemo f = new FunctionalInterfaceDemo() {
//
//			@Override
//			public void show(int x, int y) {
//				for (int i = x; i <= y; i++) {
//					System.out.print(i + " ");
//				}
//
//			}
//		};
//		f.show(10, 20);

//		FunctionalInterfaceDemo fd = (a, b) -> System.out.println("value of a:" + a + " value of b:" + b);
//		fd.show(10, 20);

		FunctionalInterfaceDemo ff = (a, b) -> a + b;
		int ans = ff.show(5, 5);
		System.out.println(ans);
	}

}
