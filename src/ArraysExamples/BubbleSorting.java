package ArraysExamples;

public class BubbleSorting {

	public static void main(String[] args) {

		int a[] = {1,3,8,2,23,43,4,9,11,6,5};
		
		System.out.println("Array size is "+a.length);
		
		//Bubble Sorting 
		int temp;
		for(int i=0;i<a.length;i++) {
			int flag = 0;
			for(int j=0;j<a.length-1-i;j++) {
				
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag==0) {
				break;
			}
		}
		
		
		System.out.println("Array is bubble sorted now ");
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
