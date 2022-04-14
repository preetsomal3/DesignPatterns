package bdd.AdapterPattern2;

public class PlasticDuck implements ToyDuck {

	ToyDuck td;
	
	public void queaks() {

		td =new Adaptar(new Sparrow());
		td.queaks();
		
	}

}
