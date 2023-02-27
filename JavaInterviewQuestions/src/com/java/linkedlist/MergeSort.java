package com.java.linkedlist;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class MergeSort {

	public static Node findMidNode(Node head) {
		if (head == null || head.next == null)
			return head;

		Node slow = head;
		Node fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node merge(Node first, Node second) {
		Node dummNode = new Node(0);
		Node temp = dummNode;
		if (first == null)
			return second;
		if (second == null)
			return first;

		while (first != null && second != null) {
			if (first.data <= second.data) {
				temp.next = first;
				temp = first;
				first = first.next;
			} else {
				temp.next = second;
				temp = second;
				second = second.next;
			}
		}

		while (first != null) {
			temp.next = first;
			temp = first;
			first = first.next;
		}
		while (second != null) {
			temp.next = second;
			temp = second;
			second = second.next;
		}

		return dummNode.next;
	}

	public static Node mergeSort(Node head) {

		if (head == null || head.next == null)
			return head;
		Node middNode = findMidNode(head);
		Node nextOfMid = middNode.next;
		middNode.next = null;
		Node first = mergeSort(head);
		Node second = mergeSort(nextOfMid);
		Node ans = merge(first, second);
		return ans;
	}

	public static void display(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(4);
		head.next.next = new Node(6);
		head.next.next.next = new Node(7);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(1);

		System.out.println("before mergesort:");
		display(head);
		Node ans = mergeSort(head);
		System.out.println("\nafter merge sort:");
		display(ans);

	}

}
