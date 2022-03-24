package ArraysExamples;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementUsingSet {

	public static void main(String[] args) {
		int a[] = {1,3,2,4,3,5,76,5,22,31,43};
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i:a) {
			
			s.add(i);
		}
		
		for(int i:s) {
			System.out.println(i);
		}
		
	}

}
