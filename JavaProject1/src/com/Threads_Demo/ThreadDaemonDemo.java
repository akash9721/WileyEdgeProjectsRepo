package com.Threads_Demo;

public class ThreadDaemonDemo extends Thread {

	public void run() {
		if ((Thread.currentThread().isDaemon())) {
			System.out.println("child damon");
		} else {
			System.out.println("not damon");
		}
	}

	public static void main(String[] args) {
		System.out.println("main damon");
		ThreadDaemonDemo dd = new ThreadDaemonDemo();
		dd.setDaemon(true);
		dd.start();

	}

}
