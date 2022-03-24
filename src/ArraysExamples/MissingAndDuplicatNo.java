package ArraysExamples;

import java.util.Arrays;

public class MissingAndDuplicatNo {
	
	
	//For Swap sort no.s should be between 1 to N where N is size of array otherwise it will give AIOB exception
	public static void main(String []args) {
		
	
	int[] a = {1,4,4,5,8,8,7,6};
	
	int i=0;
	int temp;
	while(i<a.length) {
		
		if(a[i]!=a[a[i]-1]) {
			
			temp=a[i];
			a[i]=a[a[i]-1];
			a[temp-1]=temp;
					
		}else {
			i++;
		}
		
	}
	
	for(int j=0;j<a.length;j++) {
		
		if(a[j]!=j+1) {
			
			System.out.println("Missing no. is "+ (j+1));
			
			System.out.println("Duplicate no. is "+a[j]);
			
		}
		
	}
	
	
	
	
	}
}
