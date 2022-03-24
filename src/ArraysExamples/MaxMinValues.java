package ArraysExamples;

public class MaxMinValues {

	public static void main(String[] args) {
		
		int a[] = {1,3,2,4,5,76,22,31,43};
		
		int max= Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Max value is "+max);
		System.out.println("Min value is "+min);
	}

}
