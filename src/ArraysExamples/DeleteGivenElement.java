package ArraysExamples;

import java.util.Arrays;

public class DeleteGivenElement {

	public static void main(String[] args) {

		int a[] = {1,3,2,4,5,76,22,31,43};
		
		int ele=4;
		int temp=0;
		for(int i=0;i<a.length;i++) {
			
			
			if(a[i]==ele) {
				temp++;
				for(int j=i;j<a.length-1;j++) {
					
					a[j]=a[j+1];
					
					
				}
				
				break; // if you have to delete all occurences of element then don't use break and print till (i<a.length-temp)
			}
		}
		
		if(temp==0) {
			System.out.println("Element not found");
			
		}else {
				for(int i=0;i<a.length-1;i++) {
					System.out.println(a[i]);
				}

		}
	}

}
