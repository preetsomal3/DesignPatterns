package ArraysExamples;

import java.util.Arrays;

public class SwapSort {

	public static void main(String[] args) {
		
		
		//For Swap sort no.s should be between 1 to N where N is size of array otherwise it will give AIOB exception
		
		int[] a = {1,3,4,5,8,2,7,6};
		
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
		
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
