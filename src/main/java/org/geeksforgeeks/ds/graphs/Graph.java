package org.geeksforgeeks.ds.graphs;

import java.util.LinkedList;

public class Graph {

	private int vertices;
	LinkedList<Integer> adjList[];

	public Graph(int vertices ) {
		this.vertices = vertices ;
		this.adjList = new LinkedList[vertices];

		for (int i = 0; i < vertices; i++) {
			this.adjList[i] = new LinkedList<Integer>();
		}
	}
}
