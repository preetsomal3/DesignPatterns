package ArraysExamples;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateElementUsingSet {

	public static void main(String[] args) {
		int a[]= {1,3,31,32,32,4,45,3,6,7,21,12};
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(s.add(a[i])==false) {
				System.out.println("Duplicate element is "+a[i]);
				break;
			}
		}
	}

}
