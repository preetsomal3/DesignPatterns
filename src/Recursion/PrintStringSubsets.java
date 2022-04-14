package Recursion;

public class PrintStringSubsets {

	public static void main(String[] args) {


		String input = "abc";
		String output = "";
		
		solve(input,output);
		
		
	}
	
	static void solve(String input , String output) {
		
		if(input.length()==0) {
			
			System.out.println(output);
			return;
		}
		
		String output1 = output;
		String output2 = output+input.charAt(0);
		char temp = input.charAt(0);
		input = input.replaceFirst(String.valueOf(temp), "");
		
		solve(input,output1);
		solve(input,output2);
		return;
		
	}

}
