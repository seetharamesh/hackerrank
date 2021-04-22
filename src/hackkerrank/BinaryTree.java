package hackkerrank;

//create node class
class Node{
	//A node has data, pointer to left child and pointer to right child
	int data;
	//left and right child are nodes
	Node left,right;
	
	//constructor
	//when a node is created we don't know if right and left exist.
	Node(int data){
		this.data  = data;
		right = null;
		left = null;
		
	}
}


public class BinaryTree { //this class will model the tree using Node class
	//member of the class is Node
	Node  root;
	static boolean hasPathSum(Node n, int sum) {
		//base case to exit
		if(n == null)
			return (sum ==0);
		System.out.println(sum);
		return hasPathSum(n.left, sum-n.data) || hasPathSum(n.right, sum-n.data) ;
		
	}
	
	public static void main(String[] args) {
		int sum = 20; //let's assume we need the path of tree that gives you sum of 26
		//Construct a tree here with node and child like in diagram below
		/* REMEMBER: the term root takes you the root 10, NOT child's parent(like 8 or 2)
        10
       /  \
     8     2
    / \   /
   3   5 2
  */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        
		System.out.println(hasPathSum(tree.root,sum));		//start from the root
		//if it prints true that means it has a path for that sum else the result will be false
	}

}
