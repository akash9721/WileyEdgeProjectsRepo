package com.Threads_Demo;

class Test extends Thread {

	public void run() {
		System.out.println("this is run method");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Test t = new Test();
		t.start();

	}

}
