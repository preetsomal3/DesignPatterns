package ArraysExamples;



public class BinarySearch {

	public static void main(String[] args) {

		int a[] = {1,2,5,9,12,21,45};
		
		int var=5;
		int l =0;
		int h =a.length;
		int temp=0;
		
		while(l<=h) {
			
			int m = l + (h-l)/2;
			
			if(a[m]==var) {
				System.out.println("Variable is at index "+m);
				temp=1;
				break;
			}
			else if(a[m]<var) {
				l=m+1;
				
			}else {
				h=m-1;
			}
			
		}
		if(temp==0) {
			System.out.println("Element not found");
		}
		
		
		
		
				
		
	}

}
