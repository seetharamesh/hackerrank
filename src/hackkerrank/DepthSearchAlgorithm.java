package hackkerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class DepthSearchAlgorithm {
	static class Node{
		boolean visited;
		int data;
		List<Node> neighbors;
		
		//constructor
		Node(int data){
			this.data = data;
			this.neighbors = new ArrayList();
		}
		public void addNeighbors(Node neighbors){
			this.neighbors.add(neighbors);
		}
		public List<Node> getNeighbors(){
			return this.neighbors;
		}
		public void setNeighbors(List<Node> neighbors) {
			this.neighbors = neighbors;
		} 
	}
	/*Algorithm for DFS (https://www.javatpoint.com/depth-first-search-algorithm)
	 * 1. push the root node to stack
	 * 2. check if stack is not empty and pop the top most element from stack and print it and mark it as visited
	 * 3. create a list to get all its neighbors
	 * 4. For each of those neighbors check if they are not null and not visited and add them to stack
	 * 5. Repeat step 2,3,4 until stack is empty */
	
	public void depthSearchUsingStack(Node node) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		
		while(!stack.isEmpty()) {
			Node element = stack.pop();
			if(!element.visited) {
				System.out.print( element.data + " ");
				element.visited = true;
			}
			//System.out.println("The element's neighbors are: ");
			List<Node> neighbors = element.getNeighbors();
//			if(neighbors.size() == 0) {
//				System.out.println("No neighbors!");
//			}
//			else {
				
			for(int i = 0; i < neighbors.size(); i++) {
				Node n = neighbors.get(i);
				if(n!=null && !n.visited) {
				stack.add(n);
				//System.out.println(n.data);
				}
			}
			//}
		}
	}
	
	public void depthSearchUsingRecursive(Node node) {
		List<Node> neighbors = node.getNeighbors();
		System.out.println(node.data + " ");
		node.visited = true;
		for(int i=0; i<neighbors.size();i++) {
			Node n = neighbors.get(i);
			if(n!=null && !n.visited) {
			depthSearchUsingRecursive(n);
			//System.out.println(n.data);
			}
		}
	}

	public static void main(String[] args) {
		
		//create new nodes
		Node node40 = new Node(40);
		Node node20 = new Node(20);
		Node node50 = new Node(50);
		Node node10 = new Node(10);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
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

		DepthSearchAlgorithm dsa = new DepthSearchAlgorithm();
		//System.out.println("Traversing using Depth Search Algorithm Using Stack: ");
		//dsa.depthSearchUsingStack(node40);//pass root node 40
		System.out.println("Depth Search Using Recursive: ");
		dsa.depthSearchUsingRecursive(node40);

	}

}
