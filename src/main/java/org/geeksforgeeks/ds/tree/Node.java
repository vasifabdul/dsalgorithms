package org.geeksforgeeks.ds.tree;

public class Node {
	private int data;
	public Node left;
	public Node right;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}
}
