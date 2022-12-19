
package com.Threads_Demo;

class MoviTicket2 {
	int totalticket = 10;

	public void bookticket(int ticket) {
		System.out.println("heloo");
		System.out.println("hello");
		synchronized (this) {
			if (totalticket > ticket) {
				System.out.println("Ticket booked....");
				totalticket = totalticket - ticket;
				System.out.println("Ticket available...." + totalticket);
			} else {
				System.out.println("ticket not booked");
				System.out.println("Ticket available...." + totalticket);
			}
		}
		System.out.println("hi");
		System.out.println("hi");
	}
}

public class SynchronizedBlocks extends Thread {
	static MoviTicket2 b;
	int seat;

	public void run() {
		b.bookticket(seat);
	}

	public static void main(String[] args) {
		b = new MoviTicket2();

		SynchronizedBlocks th1 = new SynchronizedBlocks();
		th1.seat = 5;
		th1.start();

		SynchronizedBlocks th2 = new SynchronizedBlocks();
		th2.seat = 4;
		th2.start();

	}

}
