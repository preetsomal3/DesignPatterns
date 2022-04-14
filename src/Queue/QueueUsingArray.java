package Queue;

public class QueueUsingArray {
	
	
	
	int[] queue;
	int rear;
	int size;
	
	QueueUsingArray(int n){
		queue=new int[n];
		rear=-1;
		size=n;
		
	}
	
	public void add(int data) {
		
		if(rear==(size-1)) {
			System.out.println("Queue is Full");
			return;
		}else {
			queue[++rear]=data;
		}
		
	}
	
	public int remove() {
		
		if(rear==-1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int front = queue[0];
			for(int i=0;i<rear;i++) {
				queue[i]=queue[i+1];
			}
			rear--;
			return front;
		}
	}
	
	public int peek() {
		
		if(rear==-1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			return queue[0];
		}
	}
	
	public boolean isEmpty() {
		return rear==-1;
	}
	

	public static void main(String[] args) {

		QueueUsingArray q = new QueueUsingArray(5);
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
