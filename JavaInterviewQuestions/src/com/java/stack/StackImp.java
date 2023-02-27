package com.java.stack;

class Stack {
	private int a[];
	private int top;
	private int capacity;

	public Stack(int size) {
		a = new int[size];
		top = -1;
		capacity = size;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack is overflow");
		} else {
			a[++top] = x;
		}
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is underflow");
		}
		return a[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return a[top];
		} else {
			System.out.println("Stack is empty!!..");
		}
		return -1;
	}
}

public class StackImp {
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(7);
		stack.push(10);
		stack.push(111);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println();
		stack.display();
		System.out.println("\npeek element is: " + stack.peek());
	}
}
