package ArraysExamples;

import java.util.ArrayList;
import java.util.List;

public class LargestConsSeqinArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,9,10,5,6,20};
		
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i:a) {
			al.add(i);
		}
		int len=0;
		for(int i=0;i<a.length;i++) {
			
			if(!al.contains(a[i]-1)) {
				
				int no = a[i];
				
				while(al.contains(no)) {
					no++;
				}
				if(len<no-a[i]) {
					
					len=no-a[i];
				}
				
				
			}
			
		}
		System.out.println(len);
		
	}

}
