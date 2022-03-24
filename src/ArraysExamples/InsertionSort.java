package ArraysExamples;

public class InsertionSort {

	public static void main(String[] args) {

		int a[] = {1,3,8,2,23,43,4,9,11,6,5};
		
		System.out.println("Array size is "+a.length);
		
		//Insertion Sorting
		int temp,j;
		for(int i=1;i<a.length;i++) {
			j=i;
			temp=a[i];
			while(j>0 && a[j-1]>temp){
				
				a[j]=a[j-1];
				j--;
				
				}
			a[j]=temp;
			
		}
		
		
		System.out.println("Array is Insertion Sorted");
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
