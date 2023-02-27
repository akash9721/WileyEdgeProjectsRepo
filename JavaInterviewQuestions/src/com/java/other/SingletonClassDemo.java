package com.java.other;

class App {

	private static App instancevariable = null;

	private App() {

	}

	public static App getInstance() {
		if (instancevariable == null) {
			instancevariable = new App();
			System.out.println("obj is creted");
		}
		return instancevariable;
	}
}

public class SingletonClassDemo {
	public static void main(String[] args) {
		App app = App.getInstance();
	}

}
