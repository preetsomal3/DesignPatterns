package ArraysExamples;

public class SecondLargest {

	public static void main(String[] args) {

		int a[]= {1,4,2,55,34,8,23,12};
		
		int largest = Integer.MIN_VALUE;
		int seclargest = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>largest) {
				
				seclargest=largest;
				largest = a[i];
			}
			else if(a[i]>seclargest && a[i]<largest) {
				
				seclargest=a[i];
			}
			
		}
		if(seclargest==Integer.MIN_VALUE)
		System.out.println("No second largest no.");
		else
			System.out.println("Second largest no. is "+seclargest);
		
	}

}
