package Tree;


public class BinaryTreeFromArrayLevelOrder {

	public static void main(String[] args) {

		int arr[]= {1,2,4,5,3,6};
		int ind=0;
		Node root = binaryTree(arr,ind);
		System.out.println(root.data);

	}
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	

	public static Node binaryTree(int []arr, int ind) {
		
	
		if(ind<arr.length) {
			Node root= new Node(arr[ind]);
		
			root.left=binaryTree(arr,2*ind+1);
			root.right=binaryTree(arr,2*ind+2);
			return root;
		}
				return null;
		
	}

}
