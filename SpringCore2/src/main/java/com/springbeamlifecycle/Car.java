package com.springbeamlifecycle;

public class Car {
	private double price;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("property set");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	public void init() {
		System.out.println("inside init method");
	}

	public void destroyed() {
		System.out.println("inside destroyed method");
	}

}
