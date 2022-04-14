package bdd.DesignPatterns.BuilderPattern;

public class Coke extends ColdDrink {

	@Override
	public String name() {

		return "Coke";
	}

	@Override
	public float price() {

		return 4f;
	}

}
