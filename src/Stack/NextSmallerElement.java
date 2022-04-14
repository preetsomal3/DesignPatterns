package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {
		int ar[]= {1,4,3,5,6,2,8};
		System.out.println(Arrays.toString(help_classmate(ar,7)));

	}
		public static int[] help_classmate(int arr[], int n) 
		{ 
		   int[] array = new int[arr.length];
		   int last = array.length-1;
		   Stack<Integer> s = new Stack<Integer>();
		   
		   for(int i=(n-1);i>=0;i--){
		      // System.out.println("index is "+i);
		       if(s.size()==0){
		           array[last--]=-1;
		       }
		       else if(s.size()>0 & s.peek()<arr[i]){
		           
		           array[last--]=s.peek();
		       }
		       else if(s.size()>0 & s.peek()>=arr[i]){
		           
		           while(s.size()>0 && s.peek()>=arr[i]){
		               s.pop();
		           }
		           if(s.size()==0){
		               array[last--]=-1;
		           }else{
		               array[last--]=s.peek();
		           }
		           
		       }
		       s.push(arr[i]);
		     //  System.out.println("Stack is "+s);
		       
		   }
		   
		   return array;
		} 

}
