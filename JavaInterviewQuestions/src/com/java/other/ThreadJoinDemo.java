package com.java.other;

class Base implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Execution of thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Base());
		t1.start();
		t1.join();
		Thread t2 = new Thread(new Base());
		t2.start();
		t2.join();
		Thread t3 = new Thread(new Base());
		t3.start();
		t3.join();
	}
}
