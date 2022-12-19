package com.Threads_Demo;

class TestDemo extends Thread {

	public void run() {
		System.out.println("this is run method");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		// t.start();

	}

}
