package bdd.trioproblem;

public class TrioTest {

	public static void main(String[] args) {


		MenuItem cheese = new CheeseSandwidch();
		MenuItem green = new GreenSalad();
		
		Trio trio = new Trio();
		
		trio.addItem(cheese);
		trio.addItem(green);
		
		System.out.println(trio.getName());
		System.out.println("Price of Trio is "+trio.getPrice());
		
		
	}

}
