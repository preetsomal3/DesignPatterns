package Recursion;
// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Recursion {
	public static void main (String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		int T=sc.nextInt();//testcases
//		while(T-->0)
//		{
	    Solution obj=new Solution();
//		    
//		    int n,k;
//		    //taking input n and k
//		    n=sc.nextInt();
//		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(2,1));
		    
		    
//		}
		
	}
}

// } Driver Code Ends


 class List{
    
 Node head;
 Node tail;

List(){
    this.head=null;
    this.tail=null;
    
}

public void add(int data){
        Node temp = new Node(data);
        
    if(head==null){
        head=temp;
        tail=temp;
    }
    else{
        
        tail.next=temp;
        tail=tail.next;
    }

    
}

public void print(){
    
    Node temp =head;
    if(head==null){
        return;
    }
    while(temp!=null){
        System.out.println(temp.data);
        temp = temp.next;
    }
    
}


}

 class Node{
    
    Node next;
    int data;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class Solution
{
    
    int ans;
   public int josephus(int n, int k)
    {
       List list = new List();
       for(int i=1;i<=n;i++){
           list.add(i);
           
       }
       
       list.print();
      System.out.println("asdfa");
       list.tail.next=list.head;
       
      solve(list.head,k-1);
        return ans;
      
    }
    
    public void solve(Node head, int k)
    {
        
        if(head.next==head){
            
            ans= head.data;
            System.out.print(ans);
            return;
            
        }
        
        int count =0;
        Node pre =head;
        Node current =head;
        
        while(count<k){
            pre = current;
            current=current.next;
        }
        if(current==head) {
        	head=head.next;
        }
       pre.next=current.next;
        
        solve(head,k);
        
    }
    
}

