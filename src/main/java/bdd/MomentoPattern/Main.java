package bdd.MomentoPattern;

public class Main {

	public static void main(String[] args) {

		Originator o = new Originator();
		Caretaker c =new Caretaker();
		
		o.setContent("a");
		c.push(o.createState());
		
		o.setContent("b");
		c.push(o.createState());
		
		o.setContent("c");
		o.restore(c.pop());
		o.restore(c.pop());
		
		System.out.println(o.getContent());
	}

}
