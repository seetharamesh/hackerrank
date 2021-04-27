package hackkerrank;

import java.util.LinkedList;
import java.util.Queue;

//Use Queue for BFS. 

public class BinaryTreeBFS {
	
	static class Node{
		char data;
		Node left, right;
		
		//constructor
		Node(char data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void printBFSPathForBinaryTree(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			
			Node n = queue.remove();
			System.out.println(n.data);
			
			if(n.left != null)
				queue.add(n.left);
			if(n.right != null) 
				queue.add(n.right);
		}
		
	}

	public static void main(String[] args) {
		
		Node root = new Node('a');
		root.left = new Node('b');
		root.right = new Node('c');
		root.left.left = new Node('d');
		root.left.right = new Node('e');
		root.left.left.left = new Node('h');
		root.left.right.left = new Node('i');
		root.left.right.right = new Node('j');
		root.right.left = new Node('f');
		root.right.right = new Node('g');
		root.right.right.right = new Node('k');
		
		BinaryTreeBFS bfs = new BinaryTreeBFS();
		bfs.printBFSPathForBinaryTree(root);

	}

}
