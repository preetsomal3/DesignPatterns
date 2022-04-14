package Miscellaneous;

import java.util.Queue;

class GfG{
	
	
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
       
       if(q.size()==1){
           
           return q;
       }
       
       Integer temp = q.remove();
        
        rev(q);
        q.o
        insert(q,temp);
        return q;
       
       
    }
    
    public void insert(Queue<Integer> q, Integer temp){
        
        if(q.size()==0){
            q.offer(temp);
            return;
        }
        
        Integer last = q.remove();
        insert(q,temp);
        q.offer(last);
        return;
        
    }
    
}
