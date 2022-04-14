package ArraysExamples;

public class ResizeArray {

	
	
public  static int[] resize(int[] a, int capacity) {
		
	int [] temp = new int[capacity];
		
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
				return temp;
			//System.out.println(a.length);

		}
	

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		
		//ResizeArray ra = new ResizeArray();
		int []temp = resize(a, 2);
		
		for(int i:temp) {
			System.out.println(i);
		}
			
		
		

}
}