package com.java.classworkday4;

public class MethodOverloading {
	/*
	 * void show() { System.out.println("this is show"); }
	 * 
	 * void show(int x) { System.out.println("the value of x is:=" + x); }
	 * 
	 * void show(String str) { System.out.println("Name of the person is:=" + str);
	 * }
	 */
	// doubt-----------------------------------------------------------------------
	int show(int x) {
		return x;
	}

	String show(String str) {
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
//		m.show();
//		m.show(10);
//		m.show("Akash");
		System.out.println(m.show(10));
		System.out.println("string is" + m.show("akash"));
	}

}
