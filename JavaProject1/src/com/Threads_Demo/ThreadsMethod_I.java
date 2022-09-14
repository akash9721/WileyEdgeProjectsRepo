package com.Threads_Demo;

public class ThreadsMethod_I extends Thread {
	public void run() {
		System.out.println("thraed class: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("hello: " + Thread.currentThread().getName());

		ThreadsMethod_I th = new ThreadsMethod_I();
		th.start();
		System.out.println(Thread.currentThread().isAlive());

		ThreadsMethod_I th2 = new ThreadsMethod_I();
		th2.start();
		System.out.println(th2.isAlive());
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("ak");
//		System.out.println(Thread.currentThread().getName());
	}

}
