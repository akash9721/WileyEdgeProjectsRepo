
public class ThreadDeamon extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon())
			System.out.println("daemon thread");
		else {

		}
	}

	public static void main(String[] args) {
		ThreadDeamon td = new ThreadDeamon();
		td.setDaemon(true);
		td.start();

	}

}
