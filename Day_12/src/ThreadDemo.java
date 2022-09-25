
public class ThreadDemo {
	public static void main(String[] args) {
		/*
		 * using Anonmous inner class:create the body of the class
		 */
		Runnable ri = () -> {
			// this is body of thread
			for (int i = 0; i <= 4; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread th = new Thread(ri);
		th.start();
	}

}
