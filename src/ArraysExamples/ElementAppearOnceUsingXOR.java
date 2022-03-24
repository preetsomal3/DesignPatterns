package ArraysExamples;

public class ElementAppearOnceUsingXOR {

	public static void main(String[] args) {

int a[] = {2,2,1,1,3,3,5,5,8,8,9};

int res=a[0];

for(int i=1;i<a.length;i++) {
	
	res=res^a[i];
	
}

System.out.println("Unique element is "+res);
	}

}
