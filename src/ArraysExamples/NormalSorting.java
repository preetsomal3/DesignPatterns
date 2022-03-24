package ArraysExamples;

import java.util.Arrays;

public class NormalSorting {

	public static void main(String[] args) {


		int a[] = {1,14,7,2,19,23,4,6};
		
		int temp;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[i]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
