package Tree;

import Tree.BTwithInOrderTraversal.Node;

public class BTwithPreOrderTraversal {

	public static void main(String[] args) {

		int arr[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		Node root = binaryTree(arr);
		//System.out.println(root.right.data);
		preOrderTraversal(root);

	}
	
	public static void preOrderTraversal(Node root) {
		
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	
	static int ind =-1;
	public static  Node binaryTree(int []arr) {
		
		ind++;
		if(arr[ind]==-1) {
			return null;
		}
		
			Node root = new Node(arr[ind]);
			root.left=binaryTree(arr);
			root.right=binaryTree(arr);
				
				return root;
		
	}

}
