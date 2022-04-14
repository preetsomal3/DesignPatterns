package bdd.DesignPatterns.AbstractFactoryPattern;

public class FactoryProducer {
	
	
	public AbstractDeviceFactory getFactory(String str) {
		
		if(str.equals("Laptop")) {
			
			return new LaptopFactory();
		}
		if(str.equals("Mobile Phone")) {
			
			return new MobilePhoneFactory();
		}
		return null;	
	}

}
