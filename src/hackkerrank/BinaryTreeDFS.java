package hackkerrank;

import java.util.ArrayList;
import java.util.Stack;

import hackkerrank.BinaryTreeBFS.Node;

public class BinaryTreeDFS {
	
	static class Node{
		char data;
		Node left,right;
		boolean visited;
		
		//constructor
		Node(char data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public void printDFSPathForBinaryTree(Node node) {
		Stack<Node> stack = new Stack<Node>();
		
		while(true) {
		while(node != null) {
			System.out.println(node.data);
			stack.push(node);
			node = node.left;	
		}
		if(!stack.isEmpty()) {
			node = stack.pop();
			node = node.right;
		}
		
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
		
		BinaryTreeDFS dfs = new BinaryTreeDFS();
		dfs.printDFSPathForBinaryTree(root);

	}

}
