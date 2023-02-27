package com.java8.Features;

interface interface1 {

	public default void display() {
		System.out.println("first interface");
	}
}

interface interface2 {

	public default void display() {
		System.out.println("second interface");
	}
}

public class Abstractmethod implements interface1, interface2 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		interface1.super.display();
	}

	public static void main(String[] args) {
		Abstractmethod abs = new Abstractmethod();
		abs.display();
	}

}
