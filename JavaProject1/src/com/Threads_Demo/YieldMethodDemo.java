package com.Threads_Demo;

public class YieldMethodDemo extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

	public static void main(String[] args) {
		YieldMethodDemo yd = new YieldMethodDemo();
		yd.start();
		Thread.yield();// main method stop and execute thread 0
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
