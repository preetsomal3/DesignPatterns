package bdd.StatePattern;

public class Main {

	public static void main(String[] args) {

		Context c = new Context();
		c.setState(new ConcreteStateA());
		c.mouseDown();
		c.mouseUp();
		
	}

}
