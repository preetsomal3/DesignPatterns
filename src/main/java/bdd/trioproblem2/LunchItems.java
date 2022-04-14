package bdd.trioproblem2;

public class LunchItems implements MenuItem {

	
	String name;
	double price;
	
	LunchItems(String name, double price){
		
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		
		return name;
	}

	public double getPrice() {

		return price;
	}
	

}
