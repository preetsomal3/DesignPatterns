package bdd.DesignPatterns.AbstractFactoryPattern;

public class LaptopFactory extends AbstractDeviceFactory{

	@Override
	public Device getDevice(String str) {
		
		if(str.equals("HP Laptop")) {
			return new HPLaptop();
		}
		if(str.equals("MacBook")) {
			return new MacBook();
		}

		return null;
	}

}
