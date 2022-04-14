package Recursion;

public class PermutationwithSpaces {

	public static void main(String[] args) {

		String input = "ABC";
		String output = "";
		output = output+input.charAt(0);
		char c = input.charAt(0);
		input = input.replaceFirst(String.valueOf(c), "");
		
		
		solve(input,output);
		
	}
	
	static void solve(String inp, String out) {
		
		
		if(inp.length()==0) {
			
		System.out.println(out);
		return;
			
		}
		
		String out1 = out+inp.charAt(0);
		String out2  = out+"_"+inp.charAt(0);
		inp = inp.replaceFirst(String.valueOf(inp.charAt(0)), "");
			solve(inp,out1);
			solve(inp,out2);
			return;
		
	}
	

}
