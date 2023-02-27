package com.java.linkedlist;

class ListNode {
	int data;
	ListNode next;

	public ListNode() {
	}

	ListNode(int data) {
		this.data = data;
	}

	ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
}

class LinkedList {
	/* Function to reverse the linked list */
	public static ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode current = node;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	private static ListNode merge(ListNode head1, ListNode head2) {
		ListNode dummy = new ListNode(-1);
		ListNode ans = dummy;
		if (head1 == null)
			return head2;

		if (head2 == null)
			return head1;

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				ans.next = head1;
				ans = ans.next;
				head1 = head1.next;
			} else {
				ans.next = head2;
				ans = ans.next;
				head2 = head2.next;
			}
		}
		while (head1 != null) {
			ans.next = head1;
			ans = ans.next;
			head1 = head1.next;
		}
		while (head2 != null) {
			ans.next = head2;
			ans = ans.next;
			head2 = head2.next;
		}
		return dummy.next;
	}

	// prints content of double linked list
	public static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args) {
		ListNode head1 = new ListNode(10);
		head1.next = new ListNode(17);
		head1.next.next = new ListNode(20);
		head1.next.next.next = new ListNode(69);
		head1.next.next.next.next = new ListNode(87);
		System.out.println("first list:");
		printList(head1);

		ListNode head2 = new ListNode(12);
		head2.next = new ListNode(27);
		head2.next.next = new ListNode(45);
		head2.next.next.next = new ListNode(89);
		head2.next.next.next.next = new ListNode(107);
		System.out.println("\nsecond list:");
		printList(head2);

		ListNode mergeListNode = merge(head1, head2);
		System.out.println("\nMerged list are");
		printList(mergeListNode);

		System.out.println("\nReverse of Linked list");
		ListNode rev = reverse(mergeListNode);
		printList(rev);

	}

}