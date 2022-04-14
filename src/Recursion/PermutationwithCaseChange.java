package Recursion;

public class PermutationwithCaseChange {

	public static void main(String[] args) {

		String input = "abc";
		String output = "";
		
		solve(input,output);
		
	}
	
	static void solve(String inp, String out) {
		
		
		if(inp.length()==0) {
			
		System.out.println(out);
		return;
			
		}
		
		String out1 = out+inp.charAt(0);
		String temp = String.valueOf(inp.charAt(0));
		temp = temp.toUpperCase();
		String out2  = out+temp;
		inp = inp.replaceFirst(String.valueOf(inp.charAt(0)), "");
			
		solve(inp,out1);
		solve(inp,out2);
			
			return;
		
	}
	

}
