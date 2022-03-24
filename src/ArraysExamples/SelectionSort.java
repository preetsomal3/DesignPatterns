package ArraysExamples;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = {1,3,8,2,23,43,4,9,11,6,5};
		
		System.out.println("Array size is "+a.length);
		
		
		//Selection Sorting 
		int temp;
		for(int i=0;i<a.length;i++) {
			int min = i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[min]) {
					
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		
		
		System.out.println("Array is Selection sorted");
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
