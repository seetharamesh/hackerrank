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
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(n);
		n.visited = true;
		
		while(!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println(element.data);		
			
			List<Node> neighbors = element.getNeighbors(n);
			for(int i = 0 ; i < neighbors.size(); i++) {
				Node node = neighbors.get(i);
				if(node != null && !node.visited) {
					queue.add(node);
					node.visited = true;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		//create all vertices(nodes)
		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);
		//add neighbors to the nodes
		node40.addNeighbors(node10);
		node40.addNeighbors(node20);
		node20.addNeighbors(node10);
		node20.addNeighbors(node30);
		node20.addNeighbors(node60);
		node20.addNeighbors(node50);
		node50.addNeighbors(node70);
		node60.addNeighbors(node70);
		node30.addNeighbors(node60);
		node10.addNeighbors(node30);

		System.out.println("Breadth Search Algorithm");
		BreadthFirstAlgorithm bfa = new BreadthFirstAlgorithm();
		//you can start the traversal from any node. Here we are using node 40
		bfa.breadthFirstUsingQueue(node40);
	}

}
