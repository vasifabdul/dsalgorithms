package org.geeksforgeeks.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private Node root;

	public BinaryTree(int data) {
		this.root = new Node(data);
	}

	public static void main(String args[])
	{
		BinaryTree binaryTree = new BinaryTree(10);
		binaryTree.root.left = new Node(11);
		binaryTree.root.left.left = new Node(7);
		binaryTree.root.right = new Node(9);
		binaryTree.root.right.left = new Node(15);
		binaryTree.root.right.right = new Node(8);

		System.out.print( "Inorder traversal before insertion:");
		binaryTree.inorder(binaryTree.root);

		int key = 12;
		binaryTree.insert(binaryTree.root, key);

		System.out.print("\nInorder traversal after insertion:");
		binaryTree.inorder(binaryTree.root);
	}

	void inorder(Node temp)
	{
		if (temp == null)
			return;

		inorder(temp.left);
		System.out.print(temp.getData()+" ");
		inorder(temp.right);
	}

	void insert(Node root, int newValue) {
		if (root == null) {
			return;
		}
		Node temp = root;
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(temp);

		while(!queue.isEmpty()) {
			temp = queue.poll();
			if (temp.left == null) {
				temp.left = new Node(newValue);
				break;
			} else {
				queue.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = new Node(newValue);
				break;
			} else {
				queue.add(temp.right);
			}
		}
	}
}
