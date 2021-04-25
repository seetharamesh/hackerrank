package hackkerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstAlgorithm {
	static class Node{
		boolean visited;
		int data;
		List<Node> neighbors;
		
		//constructor
		Node(int data) {
			this.data = data;
			this.neighbors = new ArrayList<>();
		}
		
		public List<Node> getNeighbors(Node n) {
			return this.neighbors;
		}
		
		public void addNeighbors(Node n) {
			this.neighbors.add(n);
		}
		
	}

	public void breadthFirstUsingQueue(Node n) {
		
	//yet to code
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
