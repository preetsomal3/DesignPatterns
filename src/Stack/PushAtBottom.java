package Stack;

import java.util.Stack;

public class PushAtBottom {
	
	
	

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(3);
		s.push(5);
		
		System.out.println(s);
		System.out.println(s.peek());
		
		pushBottom(s,0);
		System.out.println(s);
		System.out.println(s.peek());
	}

	 static void pushBottom(Stack<Integer> s, int i) {

		 if(s.size()==0) {
			 s.push(i);
			 return;
		 }
		 
		 int temp = s.pop();
		 pushBottom(s,i);
		 s.push(temp);
		return;
	}

}
