package com.Collection_framwork;

class Node {
	int data;
	Node left;
	Node right;

	Node(int key) {
		data = key;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	void showPreorder() {
		preorder(root);
	}

	void showPostorder() {
		postorder(root);
	}

	void showInorder() {
		inorder(root);
	}
}

public class BinaryTreeDemo {

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.root = new Node(10);
		b.root.left = new Node(20);
		b.root.right = new Node(30);
		b.root.left.left = new Node(40);
		b.root.left.right = new Node(50);
		System.out.println("preorder traversal");
		b.showPreorder();
		System.out.println("postorder traversal");
		b.showPostorder();
		System.out.println("inorder traversal");
		b.showInorder();

	}

}
