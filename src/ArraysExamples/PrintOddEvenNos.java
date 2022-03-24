package ArraysExamples;

import java.util.ArrayList;

public class PrintOddEvenNos {

	public static void main(String[] args) {

		int []a= {1,2,3,5,4,6,7,8,9};
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				a1.add(a[i]);
				
			}else {
				a2.add(a[i]);
			}
		}
		
		int total=0;
		int total1=0;
		
		System.out.println("Even nos are ");
		for(int i:a1) {
			 total = total+i;
			
		
			System.out.println(i);
			
		}
		System.out.println("Odd nos are ");
		for(int i:a2) {
			 total1 = total1+i;
			
			
			System.out.println(i);
			
		}
		
		System.out.println("Total even nos are "+a1.size());
		System.out.println("Sum of even nos "+total);
		System.out.println("Total odd nos are "+a2.size());
		System.out.println("Sum of odd nos "+total1);
	}

}
