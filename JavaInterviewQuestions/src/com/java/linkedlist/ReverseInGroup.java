package com.java.linkedlist;

class Node1 {
	int data;
	Node1 next;

	public Node1(int data) {
		this.data = data;
		next = null;
	}
}

public class ReverseInGroup {

	private static Node1 reverseInGroupII(Node1 head, int k) {
		Node1 temp = head;
		for (int i = 0; i < k; i++) {
			if (temp == null)
				return head;
			temp = temp.next;
		}
		Node1 prev = null;
		Node1 current = head;
		Node1 next = null;
		int cnt = 0;
		while (current != null && cnt < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			cnt++;
		}
		if (next != null) {
			head.next = reverseInGroupII(next, k);
		}
		return prev;
	}

	private static Node1 reverseInGroup(Node1 head, int k) {
		if (head == null || head.next == null)
			return head;

		Node1 prev = null;
		Node1 current = head;
		Node1 next = null;
		int cnt = 0;
		while (current != null && cnt < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			cnt++;
		}
		if (next != null) {
			head.next = reverseInGroup(next, k);
		}
		return prev;
	}

	private static void display(Node1 head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Node1 head = new Node1(2);
		head.next = new Node1(4);
		head.next.next = new Node1(6);
		head.next.next.next = new Node1(7);
		head.next.next.next.next = new Node1(5);
		head.next.next.next.next.next = new Node1(1);

		System.out.println("before reversing :");
		display(head);

//		System.out.println("\nReverse of linked list in group I:");
//		Node1 rev = reverseInGroup(head, 4);
//		display(rev);

		System.out.println("\nReverse of linked list in groups II:");
		Node1 rev2 = reverseInGroupII(head, 4);
		display(rev2);
	}

}
