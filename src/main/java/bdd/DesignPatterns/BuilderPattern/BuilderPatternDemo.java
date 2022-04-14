package bdd.DesignPatterns.BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {


		MealBuilder mb = new MealBuilder();
		
		Meal m1 = mb.prepareVegMeal();
		 System.out.println("Veg Meal");
		m1.showItems();
		float f1 = m1.getCost();
		
		System.out.println("Cost of Veg Meal is " +f1);
		
		Meal m2 = mb.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		m2.showItems();
		float f2 = m2.getCost();
		
		System.out.println("Cost of Non Veg Meal is " +f2);
		
	}

}
