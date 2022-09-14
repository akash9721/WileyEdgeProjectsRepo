package com.inheritence;

class Animal {

	void eat() {
		System.out.println("animal can eat");
	}

	void sleep() {
		System.out.println("animal can sleep");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog can bark");
	}

	void run() {
		System.out.println("Dog can run");
	}
}

public class Inheritence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.run();
		d.eat();
		d.sleep();

	}

}
