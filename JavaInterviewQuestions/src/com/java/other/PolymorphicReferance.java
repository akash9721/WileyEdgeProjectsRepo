package com.java.other;

class Parent {
	public static void display() {
		System.out.println("Parent class method");
	}
}

public class PolymorphicReferance extends Parent {

	public static void display() {
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		Parent obj = new PolymorphicReferance();
		obj.display();
	}

}
