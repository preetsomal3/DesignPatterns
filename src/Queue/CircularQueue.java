package Queue;

public class CircularQueue {
	
	int[] queue;
	int rear;
	int front;
	int size;
	
	CircularQueue(int n){
		queue=new int[n];
		rear=-1;
		front=-1;
		size=n;
	}
	
	public boolean isEmpty() {
		
		return front==-1 && rear==-1;
	}
	
	public void add(int data) {
		
		if((rear+1)%size==front) {
			System.out.println("Queue is Full");
			return;
		}
		else {
			rear = (rear+1)%size;
			queue[rear]=data;
			if(front==-1) {
				front=0;
			}
			
		}
	}
	
	public int remove() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			
			int result = queue[front];
			if(rear==front) {
			rear=front=-1;
			}else {
			front=(front+1)%size;
			}
			return result;
		}
		
	}
	
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}else {
			int result = queue[front];
			return result;
		}
		
		
	}
	
	public boolean isFull() {
		return (rear+1)%size==front;
	}
	

	public static void main(String[] args) {

		CircularQueue q = new CircularQueue(5);
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		q.remove();
		q.add(6);
		q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
			
		}

	}

}
