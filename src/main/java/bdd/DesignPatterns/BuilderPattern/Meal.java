package bdd.DesignPatterns.BuilderPattern;

import java.util.ArrayList;

public class Meal {
	
	ArrayList<Item> items  = new ArrayList<Item>();
	
	public void addItem(Item item) {
		
		items.add(item);
	}
	
	public void showItems() {
		
		for(Item item:items) {
			
			System.out.print("Item : " + item.name());
	         System.out.print(", Packing : " + item.packing().pack());
	         System.out.println(", Price : " + item.price());
		}
		
	}
	
	public float getCost() {
		
		float cost = 0.0f;
	      
	      for (Item item : items) {
	         cost += item.price();
	      }		
	      return cost;
		
		
	}

}
