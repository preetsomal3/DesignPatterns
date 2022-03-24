package ArraysExamples;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsin3sortedArraysUsingWhileLoop {

	public static void main(String[] args) {

		int a[] = {1,3,8,23,43};
		int b[] = {1,3,8,11};
		int c[] = {1,3,8};
		
		List<Integer> ar = new ArrayList<Integer>();
		
		int x=0,y=0,z=0;
		
		while(x<a.length && y<b.length && z<c.length) {
			
			if(a[x]==b[y] && b[y]==c[z]) {
				
				ar.add(a[x]);
				
				x++;
				y++;
				z++;
			}
			else if(a[x]<b[y]) {
				
				x++;
			}else if(b[y]<c[z]) {
				y++;
				
			}else {
				z++;
			}
				
		}
		
		for(int i:ar) {
			System.out.println(i);
		}
		
	}

}
