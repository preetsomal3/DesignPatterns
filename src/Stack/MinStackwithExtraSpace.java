package Stack;

import java.util.Stack;

public class MinStackwithExtraSpace {

	public static void main(String[] args) {

		MinStackwithExtraSpace s = new MinStackwithExtraSpace();
		s.push(3);
		s.push(5);
		s.push(8);
		s.push(1);
		System.out.println(s.getMin());

	}
	
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> ss = new Stack<Integer>();
	
	public void push(int data) {
		s.push(data);
		
		if(ss.isEmpty() || data<=ss.peek()) {
			ss.push(data);
		}
	}
	
	public int pop() {
		if(s.isEmpty()) {
			return -1;
		}
		
		int ans =s.pop();
		if(ss.peek()==ans) {
			
			ss.pop();
		}
		return ans;
		
	}
	
	public int getMin() {
		if(s.isEmpty()) {
			return -1;
		}else {
			return ss.peek();
		}
		
	}
	

}
