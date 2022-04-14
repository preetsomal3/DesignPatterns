package Recursion;

import java.util.ArrayList;

public class BalancedParanthesis {

	public static void main(String[] args) {

		int n =3;
		int open= n;
		int close=n;
		String output = "";
		
		ArrayList<String> ar = new ArrayList<String>();
		
		solve(open,close,output,ar);
		
		System.out.println(ar);
	}
	
	static void solve(int open, int close,String output, ArrayList<String> ar) {
		
		if(open==0 && close==0) {
			
			ar.add(output);
			return;
			
		}
		
		if(open!=0) {
			
			String op1 = output+"(";
			solve(open-1,close,op1,ar);
		}
		if(close>open) {
			String op2 = output+")";
			solve(open,close-1,op2,ar);
		}
		return;
		
	}

}
