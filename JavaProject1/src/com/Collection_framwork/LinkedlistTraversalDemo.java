package com.Collection_framwork;

class ListNode {
	int data;
	ListNode next;

	ListNode(int key) {
		data = key;
		next = null;
	}
}

class Linkedlist1 {

	ListNode head;

	public Linkedlist1() {
		head = null;
	}

	void display(ListNode head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	void show() {
		display(head);
	}

	public static void reverse(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode nxtptr;
		while (curr != null) {
			nxtptr = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxtptr;
		}
		head = prev;
	}
}

public class LinkedlistTraversalDemo {

	public static void main(String[] args) {
		Linkedlist1 ll = new Linkedlist1();
		ll.head = new ListNode(10);
		ll.head.next = new ListNode(12);
		ll.head.next.next = new ListNode(2);
		ll.head.next.next.next = new ListNode(20);
		System.out.println("linkedlist elements are: ");
		ll.show();

	}

}
