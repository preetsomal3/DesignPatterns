package bdd.DesignPatterns.AbstractFactoryPattern;

public class MobilePhoneFactory extends AbstractDeviceFactory {

	@Override
	public Device getDevice(String str) {
		
		if(str.equals("Iphone")) {
			return new Iphone();
		}
		if(str.equals("Samsung")) {
			return new SamsungGalaxy();
		}
		
		return null;
	}

}
