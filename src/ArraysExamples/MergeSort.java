package ArraysExamples;

import java.util.Arrays;

public class MergeSort {

	int a[];
	int length;
	int temp[];
	
	public static void main(String[] args) {

		int arr[] = {1,3,8,2,23,43,4,9,11,6,5};
		
		System.out.println("Array size is "+arr.length);
		
		MergeSort m = new MergeSort();
		
		m.sort(arr);
	
		System.out.println("Array is "+Arrays.toString(m.a));
		
	}
	
	public  void sort(int a[]) {
		
		this.a = a;
		this.length=a.length;
		temp = new int[a.length];
		
		
		divide(0,length-1);
	}
	public  void divide(int low,int high) {
		
		
		
		if(low<high) {
			int mid = low + (high-low)/2;
			System.out.println("divide");
		divide(low,mid);
		
		divide(mid+1,high);
		
		merge(low,mid,high);
		}
		
		
	}
	
	
	public void merge(int low, int mid,int high) {
		
		for(int i=low;i<=high;i++) {
			
			temp[i]=a[i];
			
		}
		
		
		int i = low;
		int j= mid+1;
		int k= low;
		while(i<=mid && j<=high) {
		if(temp[i]<temp[j]) {
		 a[k]=temp[i];
			i++;
			k++;
		}
		else if(temp[i]>temp[j]) 
		{
			a[k]=temp[j];
			j++;
			k++;
		}
		}
		
		while(i<=mid) {
			a[k]=temp[i];
			i++;
			k++;
		}
		
		System.out.println("Done");
		
	}

}
