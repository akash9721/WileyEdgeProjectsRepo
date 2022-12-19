package com.ObjectClass;

public class CloneMethodDemo {
	int i = 10;
	int j = 20;

	@Override
	public String toString() {
		return "CloneMethodDemo [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) {

		CloneMethodDemo cm = new CloneMethodDemo(); // shallow copying
		CloneMethodDemo cm2 = cm;
		cm2.i = 1;
		cm2.j = 5;
		// System.out.println(cm2);
		System.out.println(cm);
		System.out.println(cm2);

		CloneMethodDemo obj = new CloneMethodDemo(); // deep copying
		obj.i = 888; // in this we manualy set the value
		obj.j = 999;
		System.out.println(obj);

	}

}
