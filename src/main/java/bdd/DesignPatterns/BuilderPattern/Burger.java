package bdd.DesignPatterns.BuilderPattern;

public abstract class Burger implements Item{

	public abstract String name();

	public abstract float price();

	public Packing packing() {
		
		return new Wrapper();
	}

}
