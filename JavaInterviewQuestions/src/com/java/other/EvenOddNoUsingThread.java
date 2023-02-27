package com.java.other;

class Printer implements Runnable {
	static int cnt = 0;
	int remainder;

	public Printer(int remainder) {
		this.remainder = remainder;
	}

	static Object lock = new Object();

	public void print() {
		System.out.println(Thread.currentThread().getName() + " " + cnt++);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (lock) {
				while (cnt % 2 != remainder)
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				print();
				lock.notifyAll();
			}
		}
	}
}

public class EvenOddNoUsingThread {
	public static void main(String[] args) {
		Thread even = new Thread(new Printer(0), "Even Thread");
		Thread odd = new Thread(new Printer(1), "Odd Thread");
		even.start();
		odd.start();
	}
}
