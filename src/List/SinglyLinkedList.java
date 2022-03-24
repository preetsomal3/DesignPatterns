package List;

public class SinglyLinkedList {

	private Node head;

	private static class Node {

		private int data;
		private Node next;

		private Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public void insertFirst(int value) {

		Node newNode = new Node(value);
		newNode.next=head;
		head=newNode;

	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-->");

			current = current.next;

		}
		System.out.println("null");
		
	}
	
	public int length() {
		int count=0;
        Node current = head;
		while(current!=null) {
		count++;
		current=current.next;	
		}
		return count;
		
	}
    public void insertLast(int value) {
    	
    	Node newNode= new Node(value);
    	Node current = head;
    	Node previous=null;
    	while(current!=null) {
    		previous=current;
    		current= current.next;
    		
    	}
    	previous.next=newNode;
    	
    }
    
    
    public void insert(int value, int position) {
    	Node newNode = new Node(value);
    	if(position<1) {
    		System.out.println("Invalid Position Input");
    	}else {
    	if(position==1) {
    		
    	newNode.next=head;
    	head=newNode;
    	}else{
    	int count=1;
    	Node previous=head;
    	
    	while(count<position-1)
    	{
    		
    	previous = previous.next;
    	count++;
    		
    	}
    	Node temp = previous.next;
    	previous.next= newNode;
    	newNode.next=temp;
    	
    }
    }
    }
    
    public Node deleteFirstNode() {
    	
    	Node current = head;
    	head = head.next;
    	current.next=null;
    	return current;
    	
    	 
    }
    
    public Node deleteLastNode() {//add option for single node scenario
    	 
    	if(head==null)
    	{
    		return head;
    	}
    	if(head.next==null) {
    	Node previous = head;
    	head=null;
    	return previous;
    	}
    	else {
    	Node current = head;
    	Node previous = head;
    	
    	while(current.next!=null) {
    	previous=current;
    	current = current.next;
    		
    	}
    	previous.next=null;
    	return current;
    	}
    	
    }
    
    public Node delete(int position) {
    	Node previous = head;
    	if(head==null) {
    		return head;
    	}
    	if(position==1) {
    		head=head.next;
    		previous.next=null;
    		return previous;
    	}
    	int count = 1;
    	
    	while(count<position-1) {
    	
    	 previous = previous.next;
    	 count++;
    	
    	}
    	Node current=previous.next;
    	previous.next=current.next;
    	current.next=null;
    	
    	return current;
    	
    }

public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
        
		sll.head= new Node(9);
		Node n2= new Node(5);
		Node n3= new Node(1);
		sll.head.next=n2;
		n2.next=n3;
		n3.next=null;
		
		sll.insertFirst(8);
        sll.insertLast(6);
        sll.insertFirst(3);
        sll.insertLast(2);
        sll.insert(4, 3);
		sll.display();
		System.out.println("Length is "+sll.length());
		System.out.println(sll.deleteFirstNode().data);
		System.out.println(sll.deleteFirstNode().data); 
		sll.display();
		System.out.println("Length is "+sll.length());
		System.out.println(sll.deleteLastNode().data);
		sll.display();
		System.out.println(sll.delete(3).data);
		sll.display();
		
	}
}
