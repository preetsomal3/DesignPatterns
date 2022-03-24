package ArraysExamples;

public class InsertElementinArray {

	public static void main(String[] args) {

		int a[] = {1,3,2,4,5,76,22,31,43};
		
		int pos =3;
		int ele=33;
		
		for(int i=a.length-1;i>pos-1;i--) {
			
			a[i]=a[i-1];
			
		}
		a[pos-1]=ele;
		
		for(int i:a) {
			System.out.println(i);
		}
	}

}
