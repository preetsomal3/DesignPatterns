package ArraysExamples;

public class MovingZeroesToEndofArray {

	public static void main(String[] args) {


		int a[] = {1,3,0,0,6,0,0,13,4,2,0};
		
		//We can also use the algorithm to delete element 0 from an array, this will automatically solve the purpose 
	   //Below, we are using 2 pointers, 1 for Zero and other for Non-Zero element
		
		int j=0;
		int temp;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0 && a[j]==0) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			} 
			if(a[j]!=0) {
				j++;
			}
			
			
			
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	
	}

}
