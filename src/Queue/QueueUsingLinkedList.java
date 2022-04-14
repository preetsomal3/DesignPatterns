package Queue;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class QueueNode
	{
		int data;
		QueueNode next;
		QueueNode(int a)
		{
		    data = a;
		    next = null;
		}
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	     QueueNode temp = new QueueNode(a);
       if(front==null && rear==null){
          front=rear=temp;
       }
       else{
           rear.next=temp;
           rear=temp;
       }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
       
       if(front==null && rear==null){
           return -1;
       }
         else{
               int res =front.data;
               if(front==rear){
                   rear=null;
               }
               front=front.next;
               return res;
           }
       
	}


	}
}
