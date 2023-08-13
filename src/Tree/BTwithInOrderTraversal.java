package Tree;



public class BTwithInOrderTraversal {

	public static void main(String[] args) {

		int arr[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		Node root = binaryTree(arr);
	//	System.out.println(root.right.data);
		inOrderTraversal(root);

	}
	
	public static void inOrderTraversal(Node root) {
		
		if(root==null) {
			return;
		}
		
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
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
