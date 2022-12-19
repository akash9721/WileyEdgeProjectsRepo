package com.Collection_framwork;

interface I1 {
	void show();
}

interface I2 {
	void display();
}

class Abc implements I1, I2 {
	public void show() {
		System.out.println("hhhhh");
	}

	public void display() {
		System.out.println("asdk");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.display();
		obj.show();

	}

}
