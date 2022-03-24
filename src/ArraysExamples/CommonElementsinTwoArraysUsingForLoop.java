package ArraysExamples;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsinTwoArraysUsingForLoop {

	public static void main(String[] args) {

		int a[] = {1,3,8,2,23,43,4,9,11,6,5};
		int b[] = {1,3,8,2,11,6,5};
	
		Set<Integer> s =new HashSet<Integer>();
		
			
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					s.add(a[i]);
				}
				
				
			}
		}
		
		for(int i:s) {
			
			System.out.println(i);
		}
		
	}

}
