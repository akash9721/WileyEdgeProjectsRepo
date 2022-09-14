package com.Threads_Demo;

class Testt implements Runnable {

	public void run() {
		System.out.println("this is method");
	}
}

public class ThreadUsingRunnable {
	public static void main(String[] args) {
		Testt t = new Testt();
		Thread th = new Thread(t);
		th.start();
	}

}
