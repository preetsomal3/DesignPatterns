package Stack;

import java.util.ArrayList;
import java.util.List;

public class ImplementStackUsingArrayList {
	
	List<Integer> list = new ArrayList<Integer>();
	
	
	void push(int data) {
		list.add(data);
	}
	
	int pop() {
		
		if(list.size()==0){
			return -1;
		}else {
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
	}
	
	int peek() {
		
		if(list.size()==0) {
			return -1;
		}else {
			
			return list.get(list.size()-1);
			
		}
		
	}
	
	public boolean isEmpty() {
		return list.size()==0;
	}
	
	public static void main(String[] args) {

		ImplementStackUsingArrayList s = new ImplementStackUsingArrayList();
		s.push(54);
		s.push(2);
		s.push(3);
		s.push(32);
		System.out.println(s.pop());
		System.out.println(s.peek());
		

	}

}
