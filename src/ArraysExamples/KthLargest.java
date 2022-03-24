package ArraysExamples;

public class KthLargest {

	public static void main(String[] args) {

int a[] = {1,3,21,54,5,22,12,8,67};

int k=4;
int temp;

for(int i=0;i<a.length;i++) {
	int m=i;
	for(int j=i+1;j<a.length;j++) {
		
		if(a[j]>a[m]) {
			m=j;
		}
		
	}
	
	temp=a[m];
	a[m]=a[i];
	a[i]=temp;
	
	if(i==k-1) {
		System.out.println(k+"th Largest no. is "+a[i]);
	}
	
	
}

		
	}

}
