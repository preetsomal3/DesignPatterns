package Stack;

public class ImplementStackUsingArray {
	
	//1. Implement Stact using array
	//2. Sort a stack 
	//3. Delete middle element from a stack

	int stack[] = new int[10]; 
	int tos=-1;
	
	
	
	void push(int data) {
		
		if(tos==9) {
			System.out.println("Stack is full");
		}
		stack[++tos]=data;
		
	}
	
	int pop() {
		
		if(tos<0) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[tos--];
		
	}
	
	
	void print() {
		
		for(int i=0;i<=tos;i++) {
			
			System.out.println(stack[i]);
		}
	}
	
	
	void sort() {
		
		if(tos==0) {
			
			return;
		}
		
		int last = this.stack[tos];
		pop();
		
		sort();
		
		insert(last);
		
	}
	
	void insert(int last) {
		
		if(tos==-1 || stack[tos]<=last) {
			push(last);
			return;
		}
		int val=stack[tos];
		pop();
		insert(last);
		push(val);
		
		
	}
	
	
	void deleteMiddle(int k) {
		
		if (k==1) {
			pop();
			return;
		
		}
		
		int temp = pop();
		deleteMiddle(k-1);
		push(temp);
		
		
	}
	
	void reverse() {
		if(tos==0) {
			return;
		}
		int temp = pop();
		reverse();
		insertReverse(temp);
	}
	
	
	void insertReverse(int temp) {
		
		if(tos==-1) {
			push(temp);
			return;
		}
		
		
		int last = pop();
		insertReverse(temp);
		push(last);
	}
	public static void main(String[] args) {

		ImplementStackUsingArray s = new ImplementStackUsingArray();
		
		s.push(10);
		s.pop();
		s.push(3);
		s.push(6);
		s.push(9);
		s.push(1);
		s.push(5);
		s.print();
		System.out.println("************************");
		s.sort();
		s.print();
		
		int middle = (s.tos+1)/2+1;
		s.deleteMiddle(middle);
		System.out.println("****************");
		s.print();
		s.reverse();
		System.out.println("****************");
		s.print();

	}

}
