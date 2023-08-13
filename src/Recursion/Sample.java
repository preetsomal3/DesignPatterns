package Recursion;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		
		s.recursion(2);

	}
	
	void recursion(int a ) {
		
		static int i=0;
		System.out.println(i);
		i++;
		if(a==0) {
			return;
			
		}
		System.out.println(i);
	
		recursion(a-1);
		
	}

}
