package ArraysExamples;

public class RemoveDuplicateElementfromSortedArrayUsingForLoop {

	public static void main(String[] args) {

		int a[] = {1,3,3,2,4,4,5,5,5,76,22,31,43};
		
		int temp[] =new int[a.length];
		int j=0;
		
		for(int i=0;i<a.length-1;i++) {
			
			
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
			
		}
		temp[j]=a[a.length-1];
		
		for(int i=0;i<=j;i++) {
			System.out.println(temp[i]);
		}
		
		
	}

}
