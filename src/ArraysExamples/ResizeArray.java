package ArraysExamples;

public class ResizeArray {

	static int [] temp;
	
public  static void resize(int[] a, int capacity) {
		
		temp = new int[capacity];
		
	///Important example to understand pass by value and pass by reference concept and the concept of scope of a local variable and objects pointing also
			
	
		if(capacity>a.length) {
		for(int i=0;i<a.length;i++) {
			
			temp[i]=a[i];
		}
		
		}
		else {
			
			for(int i=0;i<capacity;i++) {
				
				temp[i]=a[i];
			}
		
		}
				a=temp;
			System.out.println(a.length);

		}
	

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		
		//ResizeArray ra = new ResizeArray();
		resize(a, 8);
		
		for(int i:temp) {
			System.out.println(i);
		}
			
		
		

}
}