package ArraysExamples;

import java.util.HashSet;
import java.util.Set;

public class CommonElein3arrayusingSet {

	public static void main(String[] args) {

		int a[] = {1,3,8,23,43};
		int b[] = {1,3,8,11};
		int c[] = {1,3,8};
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		Set<Integer> s3 = new HashSet<Integer>();
		
		for(int i:a) {
			
			s1.add(i);
			
		}
		for(int i:b) {
			s2.add(i);
		}
		for(int i:c) {
			
			if(s1.add(i)==false) {
				if(s2.add(i)==false) {
					System.out.println(i);
				}
			}
			
		}
	}

}
