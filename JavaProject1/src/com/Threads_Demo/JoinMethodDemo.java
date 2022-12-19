package com.Threads_Demo;

public class JoinMethodDemo extends Thread {
	public void run() {
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
		JoinMethodDemo jm = new JoinMethodDemo();
		// if a thread want wait for another thread to complete its task, then we should
		// use join method
		jm.start();
		try {
			jm.join(); // here main method waiting firstly thread 0 will
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

}
