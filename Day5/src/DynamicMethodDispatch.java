class A {
	public void show() {
		System.out.println("IN A");
	}
}

class B extends A {
	public void show() {
		System.out.println("IN B");
	}
}

class C extends B {
	public void show() {
		System.out.println("IN C");
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		A aa = new B();
		aa.show();

	}

}
