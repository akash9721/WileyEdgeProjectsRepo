package com.Threads_Demo;

class MoviTicket {
	int totalticket = 10;

	public synchronized void bookticket(int ticket) {
		if (totalticket > ticket) {
			System.out.println("Ticket booked....");
			totalticket = totalticket - ticket;
			System.out.println("Ticket available...." + totalticket);
		} else {
			System.out.println("ticket not booked");
			System.out.println("Ticket available...." + totalticket);
		}
	}
}

public class SynchronizationDemo2 extends Thread {
	static MoviTicket b;
	int seat;

	public void run() {
		b.bookticket(seat);
	}

	public static void main(String[] args) {
		b = new MoviTicket();

		SynchronizationDemo2 th1 = new SynchronizationDemo2();
		th1.seat = 5;
		th1.start();

		SynchronizationDemo2 th2 = new SynchronizationDemo2();
		th2.seat = 4;
		th2.start();

	}

}
