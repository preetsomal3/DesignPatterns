package Stack;

public class ImplementStackUsingLinkedList {

	public static void main(String[] args) {

		ImplementStackUsingLinkedList ob = new ImplementStackUsingLinkedList();
		ob.push(23);
		ob.push(32);
		System.out.println(ob.pop());

	}
	
	
	class StackNode{
		
		int data;
		StackNode next;
		
		StackNode(int a){
			
			this.data=a;
			this.next=null;
		}
		
	}
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        
        StackNode temp=new StackNode(a);
        if(top==null){
            top=temp;
        }else{
        temp.next=top;
        top=temp;
        }
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        if(top!=null){
            
            int value = top.data;
            top=top.next;
            return value;
            
        }else{
        return -1;
        }
    }


}
