package bdd.DesignPatterns.FactoryPattern;

public class CompanyFactory {
	
	public Company getCompany(String str) {
		
		if(str.equals("Airtel")) {
			return new Airtel();
		}
		if(str.equals("Jio")) {
			return new Jio();
		}
		if(str.equals("Vodafone")) {
			return new Vodafone();
		}
		return null;
	}

}
