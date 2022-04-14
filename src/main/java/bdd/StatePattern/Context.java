package bdd.StatePattern;

public class Context {
	
	private State state;
	
	public void setState(State state) {
		this.state=state;
	}
	
	public void mouseUp() {
		state.mouseUp();
	}
	
	public void mouseDown() {
		state.mouseDown();
	}

}
