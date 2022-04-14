package bdd.StatePatternAbuse;

public class Stopwatch {
	
	private State state=new StoppedState(this);
	
	public void setState(State state) {
		this.state=state;
	}
	
	
	public void click() {
		state.click();
	}

}
