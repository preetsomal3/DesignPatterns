package bdd.DesignPatterns.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {


		FactoryProducer fp = new FactoryProducer();
		
		AbstractDeviceFactory af = fp.getFactory("Laptop");
				Device d = af.getDevice("HP Laptop");
				d.getDetails();
				
				Device d1 = af.getDevice("MacBook");
				d1.getDetails();
				
				AbstractDeviceFactory af1 = fp.getFactory("Mobile Phone");
				Device d2 = af1.getDevice("Iphone");
				d2.getDetails();
				
				Device d3 = af1.getDevice("Samsung");
				d3.getDetails();		
				
		
	}

}
