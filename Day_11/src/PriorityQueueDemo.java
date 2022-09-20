import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(10);
		pq.offer(1);
		pq.offer(20);
		pq.offer(100);
		pq.offer(80);
		System.out.println(pq); // by default it used min heap

		pq.poll(); // element come out which priority are graeter
		System.out.println(pq);

		System.out.println(pq.peek()); // print the element which is going to be print on next

		// max heap
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq1.offer(10);
		pq1.offer(1);
		pq1.offer(20);
		pq1.offer(100);
		pq1.offer(80);
		System.out.println(pq1);

	}

}
