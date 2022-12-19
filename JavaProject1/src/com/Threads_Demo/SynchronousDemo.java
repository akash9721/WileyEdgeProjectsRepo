package com.Threads_Demo;

class Check {
	public void count() { // now one thread firstly used the method then another method will execute
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
		synchronized (this) {
			for (int i = 0; i < 4; i++) {
				System.out.println(Thread.currentThread().getName() + " :" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
		System.out.println("helloooooooooooooooooooooooooo");
	}
}

class Mythread1 extends Thread {

	Check t;

	public Mythread1(Check t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.count();
	}
}

public class SynchronousDemo {
	public static void main(String[] args) {
		Check c = new Check();
		Mythread1 mt = new Mythread1(c);
		Mythread1 mt2 = new Mythread1(c);
		mt.start();
		mt2.start();

	}

}
