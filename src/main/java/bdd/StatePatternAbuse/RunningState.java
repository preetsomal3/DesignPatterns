package bdd.StatePatternAbuse;

public class RunningState implements State {

	private Stopwatch s;
	
	public RunningState(Stopwatch s){
		
		this.s=s;
	}
	
	public void click() {

		s.setState(new StoppedState(s));
		System.out.println("Stopped");
		
	}

}
