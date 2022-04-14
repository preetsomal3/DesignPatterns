package Queue;

import java.util.Queue;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Queue<Integer> rev(Queue<Integer> q){
	       
	       if(q.size()==1){
	           
	           return q;
	       }
	       
	       Integer temp = q.remove();
	        
	        rev(q);
	        
	        q.add(temp);
	       
	       return q;
	    }

}
