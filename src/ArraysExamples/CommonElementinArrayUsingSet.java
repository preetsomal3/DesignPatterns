package ArraysExamples;

import java.util.HashSet;
import java.util.Set;

public class CommonElementinArrayUsingSet {

	public static void main(String[] args) {

		int a[] = {1,3,8,2,23,43,4,9,11,6,5};
		int b[] = {1,3,8,2,11,6,5};
	
		Set<Integer> s1 =new HashSet<Integer>();
		
		Set<Integer> s2 = new HashSet<Integer>();
		
		Set<Integer> s3= new HashSet<Integer>();
		
		for(int i:a) {
			s1.add(i);
		}
		
		for(int i:b) {
			s2.add(i);
		}
		
		for(int i:s1) {
			
			if(s2.add(i)==false) {
				System.out.println(i);
			}
		}
		System.out.println("*******************Way 2 - NA for Duplicate Elements**********************");
		for(int i:a) {
			s3.add(i);
		}
		for(int i:b) {
			
			if(s3.add(i)==false) {
				
				System.out.println(i);
			}
		}
		
	}

}
