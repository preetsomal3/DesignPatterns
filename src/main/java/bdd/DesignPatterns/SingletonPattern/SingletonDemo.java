package bdd.DesignPatterns.SingletonPattern;

public class SingletonDemo {

	public static void main(String[] args) {


		Singleton obj1 = Singleton.getInstance();
		
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1.toString() +" "+ obj2.toString());
	}

}
