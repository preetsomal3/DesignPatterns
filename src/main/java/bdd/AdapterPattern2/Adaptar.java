package bdd.AdapterPattern2;

public class Adaptar implements ToyDuck  {

	Bird bird;
	
	Adaptar(Bird bird){
		
		this.bird=bird;
	}
	
	public void queaks() {
			this.bird.makeSound();
	}

}
