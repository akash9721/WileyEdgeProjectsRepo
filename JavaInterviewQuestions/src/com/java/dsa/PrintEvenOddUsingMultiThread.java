package com.java.dsa;

class Printer implements Runnable {
	static int counter = 1;
	int reminder;

	public Printer(int reminder) {
		this.reminder = reminder;
	}

	static Object lock = new Object();

	public void print() {
		System.out.println(Thread.currentThread().getName() + " " + counter++);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (lock) {
				while (counter % 2 != reminder) // if no is even
					try {
						lock.wait(); // then it block for odd no
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				print();
				lock.notifyAll();
			}
		}
	}
}

public class PrintEvenOddUsingMultiThread {
	public static void main(String[] args) {

		Thread even = new Thread(new Printer(0), "even Thread");
		Thread odd = new Thread(new Printer(1), "odd  Thread");
		even.start();
		odd.start();
	}

}
