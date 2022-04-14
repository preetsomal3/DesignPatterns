package bdd.trioproblem2;

public class Trio implements MenuItem {
	
	Sandwidch sand;
	Salad salad;
	Drink drink;
	
	Trio(Sandwidch sd, Salad s, Drink d){
		
		sand = sd;
		salad = s;
		drink = d;
	}
	
	public String getName() {
		
		String s = sand.getName()+"/"+salad.getName()+"/"+drink.getName()+" trio";
		return s;
	}

	public double getPrice() {
		double p1 = sand.getPrice();
		double p2 = salad.getPrice();
		double p3 = drink.getPrice();
		
		 double p4 = Math.min(p1,p2);
		 double p5 = Math.min(p3, p4);
		 

		
		return p1+p2+p3-p5;
	}

}
