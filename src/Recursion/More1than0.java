package Recursion;

import java.util.ArrayList;

public class More1than0 {
	
	
	public static void main(String []args) {
		
		
		More1than0 s = new More1than0();
		System.out.println(s.NBitBinary(3));
	}
	
    ArrayList<String> NBitBinary(int N) {
        
        int one=0;
        int zero=0;
        
        String out="";
        
        ArrayList<String> ar = new ArrayList<String>();
        solve(one,zero,N,out,ar);
        return ar;
        
    }
    
   void solve(int one,int zero,int N,String out,ArrayList<String> ar)
    
    {
        
        if(N==0){
            ar.add(out);
            return;
        }
        
        String op1 = out+"1";
        
        solve(one+1,zero,N-1,op1,ar);
        
        if(one>zero){
            
            String op2= out+"0";
            solve(one,zero+1,N-1,op2,ar);
        }
        
        
    }
    
}