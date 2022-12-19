package com.Threads_Demo;

public class SleepMethodDemo extends Thread {
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
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + ":" + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SleepMethodDemo sm = new SleepMethodDemo();
		sm.start();

		SleepMethodDemo sm2 = new SleepMethodDemo();
		sm2.start();
	}

}
