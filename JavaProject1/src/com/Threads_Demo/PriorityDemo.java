package com.Threads_Demo;

public class PriorityDemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		PriorityDemo p = new PriorityDemo();
		p.setPriority(MIN_PRIORITY);
		p.start();
	}

}
