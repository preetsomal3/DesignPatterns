package bdd.trioproblem2;

public class TrioTest {

	public static void main(String[] args) {


		Salad green = new Salad("greensalad", 3);
		Sandwidch cheese = new Sandwidch("Cheese", 7);
		
		Drink pepsi = new Drink("Pepsi",6);
		
		Trio trio = new Trio(cheese,green,pepsi);
		
		System.out.println(trio.getName());
		System.out.println(trio.getPrice());
		
	}

}
