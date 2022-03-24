package ArraysExamples;

public class MaxSumSubarrayKadanesAlgo {

	public static void main(String[] args) {

		
		int a[] = {4,-2,-3,4,-1,-2,1,5,-3};
		
		
		int maxsofar= Integer.MIN_VALUE;
		int maxendinghere=0;
		int start = 0;
		int s=0;
		int end=0;
		
		for(int i=0;i<a.length;i++) {
			
			maxendinghere = maxendinghere + a[i];
			
			if(maxsofar<maxendinghere) {
				maxsofar=maxendinghere;
				start = s;
				end=i;
				
			}
			if(maxendinghere<0) {
				maxendinghere=0;
				s=i+1;
				
			}
			
		}
		System.out.println("Max value is "+maxsofar);
		System.out.println("Starting and ending index are "+start+" "+end);
		
		
	}

}
