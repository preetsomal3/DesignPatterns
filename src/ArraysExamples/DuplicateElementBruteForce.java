package ArraysExamples;

public class DuplicateElementBruteForce {

	public static void main(String[] args) {

int a[]= {1,3,3,32,32,4,45,3,6,7,21,12};
	
for(int i=0;i<a.length;i++) {
	
	for(int j=i+1;j<a.length;j++) {
		
		if(a[i]==a[j]) {
			System.out.println("Duplicate Element is "+a[j]);
		}
		
	}
}

	}
	
}
