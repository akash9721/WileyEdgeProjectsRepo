package com.Threads_Demo;

public class JoinMethod2Demo extends Thread {
	static Thread mainthredreference;

	public void run() {
		try {
			mainthredreference.join(); // here thread-0 wait firstly main thread complete their execution then it start
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i <= 5; i++) {

			try {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		mainthredreference = Thread.currentThread();
		JoinMethod2Demo jm = new JoinMethod2Demo();
		// if a thread want wait for another thread to complete its task, then we should
		// use join method
		jm.start(); // here main method waiting firstly thread 0 will
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
