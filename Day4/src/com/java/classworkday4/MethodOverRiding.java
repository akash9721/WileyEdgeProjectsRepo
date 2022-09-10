package com.java.classworkday4;

class Base {
	Object show() {
		System.out.println("this is base class");
		return null;
	}
}

public class MethodOverRiding extends Base {
	Integer show() { // in java method overriding retuen type may change but child overidden method's
						// should be sub-type of parent type
		System.out.println("this is derived class");
		return null;
	}

	public static void main(String[] args) {
		Base b = new Base();
		b.show();
		System.out.println();
		MethodOverRiding m = new MethodOverRiding();
		m.show();

	}

}
