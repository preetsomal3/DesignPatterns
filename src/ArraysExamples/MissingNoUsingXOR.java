package ArraysExamples;

import java.util.HashSet;
import java.util.Set;

public class MissingNoUsingXOR {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,10,11,13};
		
		Set<Integer> s1= new HashSet<Integer>();
		Set<Integer> s2= new HashSet<Integer>();
		
		int x=a[0];
		int x1=1;
		
		for(int i=1;i<a.length;i++) {
			
			x=x^a[i];
		}
		
		for(int i=2;i<=a[a.length-1];i++) {
			
			x1=x1^i;
		}
		int result = x^x1;
		System.out.println(result);
	}

}
