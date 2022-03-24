package Recursion;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int a[]= {1,4,2,6,5,0,3};
		int n = a.length;
		sort(a,n);
		System.out.println(Arrays.toString(a));
		
	}
	
	static void sort(int arr[],int n) {
		
		if(n==1) {
			return;
		}
		
		int last= arr[n-1];
		
		sort(arr,n-1);
		
	insert(arr,n-1,last);
	
//2nd Way without using Insert Recursion	
	
//		int j = n-2;
//		
//		while(j>=0 && arr[j]>last) {
//			arr[j+1]=arr[j];
//			j--;
//			
//		}
//		arr[j+1]=last;
		
	}
	
	static void insert(int arr[], int n, int last) {
		
		if(n==0 || arr[n-1]<=last) {
			arr[n]=last;
			return;
		}
		int val = arr[n-1];
		
		insert(arr,n-1,last);
		arr[n]=val;
			
		}
	

}
 