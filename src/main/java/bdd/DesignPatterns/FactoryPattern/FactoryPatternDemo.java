package bdd.DesignPatterns.FactoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		
		CompanyFactory f = new CompanyFactory();
		
		Company c = f.getCompany("Airtel");
		c.getRate();
		
		
		Company c1=f.getCompany("Jio");
		
		c1.getRate();
		

		Company c2 = f.getCompany("Vodafone");
		
		c2.getRate();
		
		System.out.println(c.toString()+" "+c1.toString()+" "+c2.toString());
		
	}

}
