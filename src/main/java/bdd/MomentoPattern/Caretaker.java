package bdd.MomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	private List<Momento> list= new ArrayList<Momento>();
	
	public void push(Momento state) {
		list.add(state);
	}
	public Momento pop() {
		
		Momento last = list.get(list.size()-1);
		list.remove(last);
		return last;
		
	}
	
}
