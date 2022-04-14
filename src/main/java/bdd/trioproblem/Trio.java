package bdd.trioproblem;

import java.util.ArrayList;

public class Trio implements MenuItem {
	
	ArrayList<MenuItem> ar = new ArrayList<MenuItem>();
	
	public MenuItem addItem(MenuItem item) {
		
		ar.add(item);
		
		return item;
	}
	
	public String getName() {
		String s="";
		for(MenuItem m:ar) {
			
			s= s+m.getName()+" ";
		}
		return s;
	}

	public double getPrice() {
		double price=0;
		for(MenuItem m:ar) {
			
			price= price+m.getPrice();
		}
		return price;
	}

}
