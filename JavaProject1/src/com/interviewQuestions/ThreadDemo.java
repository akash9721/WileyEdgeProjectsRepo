package com.interviewQuestions;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0)
				System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo th1 = new ThreadDemo();
		th1.start();

		ThreadDemo th2 = new ThreadDemo();
		th2.start();
	}
}
