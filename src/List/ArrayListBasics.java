package List;


import java.util.ArrayList;
import java.util.Arrays;  

public class ArrayListBasics {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList(Arrays.asList(1,20,30));
		ar.add(null);
		ar.add(null);
		ar.add("Null");
		Object obj = 1; 
		ar.remove(obj);
		Object[] ob = ar.toArray();
		
		System.out.println(ar);
		
//		for(Object o : ob) {
//		System.out.println(o.toString());
//
//	}

}
}
