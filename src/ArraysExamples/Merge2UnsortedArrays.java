package ArraysExamples;

public class Merge2UnsortedArrays {

	public static void main(String[] args) {


		int arr1[] = { 10,20,30,40,50 };
		int arr2[] = {5,15,25,35,45,55,65,75};
		int n = arr1.length;
		int m = arr2.length;
		int len = n+m;
        int[] temp = new int[len];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<n && j<m){
            
            if(arr1[i]<arr2[j])
            {
                temp[k]=arr1[i];
                k++;
                i++;
                
            }else if(arr1[i]>arr2[j]){
                temp[k]=arr2[j];
                k++;
                j++;
            }
            // }else if(arr1[i]==arr2[j]){
            //     temp[k]=arr1[i];
            //     k++;
            //     i++;
            // }
        }
        
        if(n<m){
            
            while(j<m){
                temp[k]=arr2[j];
                k++;
                j++;
            }
            }else if(m<n){
                while(i<n){
                    temp[k]=arr1[i];
                    k++;
                    i++;
                }
            }
        
        
		
	for(int l:temp) {
		
		System.out.println(l);
	}
		
		
		
//		int length = a.length + b.length;
//		
//		int c[]= new int[length];
//		 int i=0,j=0,k=0;
//		 
//		 while(i<a.length && j<b.length) {
//			 
//			 if(a[i]<b[j]) {
//				 
//				 c[k]=a[i];
//				 k++;
//				 i++;
//			 }else if(a[i]>b[j]) {
//				 c[k]=b[j];
//				 k++;
//				 j++;
//			 }else if(a[i]==b[j]){
//				 c[k]=a[i];
//				 k++;
//				 i++;
//			 }
//			 
//		 }
//		 System.out.println(i);
//		 System.out.println(j);
//		 System.out.println(k);
//		 if(a.length<b.length) {
//			 
//			 while(j<b.length) {
//				 
//				 c[k]=b[j];
//				 k++;
//				 j++;
//			 }
//			 
//			 }
//		 else if(a.length>b.length) {
//			 while(i<a.length) {
//				 
//				 c[k]=a[i];
//				 k++;
//				 i++;
//			 }
//		 
//		 }
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//		
//		 for(int l:c) {
//			 
//			 System.out.println(l);
//		 }
//		
		
	
	}
}
