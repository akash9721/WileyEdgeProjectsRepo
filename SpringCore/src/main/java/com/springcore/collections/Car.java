package com.springcore.collections;

public class Car {
	double price;
	double speed;
	String name;

	Car(String name, double price) {
		this.name = name;
		this.price = price;
		System.out.println("string double");
	}

	public Car(double price, double speed) {
		this.price = price;
		this.speed = speed;
		System.out.println("double double");
	}

	Car(double price, String name) {
		this.price = price;
		this.name = name;
		System.out.println("double string");
	}

	Car(String name, String name1) {
		this.name = name;
		this.name = name1;
		System.out.println("string string");
	}
//
//	@Override
//	public String toString() {
//		return "Car [name=" + name + ", price=" + price + "]";
//	}

}
