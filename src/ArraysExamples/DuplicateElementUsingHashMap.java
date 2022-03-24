package ArraysExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementUsingHashMap {

	public static void main(String[] args) {
		
		int a[]= {1,3,3,32,32,4,45,3,6,7,21,12};
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(m.containsKey(a[i])) {
				
				m.put(a[i], m.get(a[i])+1);
			}else {
				m.put(a[i], 1);
			}
					
		}
		
		 Set<Integer> s=m.keySet();
		
		 for(int i:s) {
			 
			 if(m.get(i)>1) {
				 System.out.println("Duplicate element is "+i);
			 }
			 
		 }
	
	}

}
