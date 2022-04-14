package bdd.StatePatternAbuse;

public class StoppedState implements State{
	private Stopwatch s;
	
	StoppedState(Stopwatch s){
		this.s=s;
	}
	
	public void click() {
		
		s.setState(new RunningState(s));
		System.out.println("Running");
	}

}
