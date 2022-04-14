package bdd.MomentoPattern;

public class Originator {
	
	private String content;
	
	public void setContent(String content) {
		this.content=content;
	}
	
	public String getContent() {
		return content;
	}
	
	
	public Momento createState() {
		
		return new Momento(content);
	}
	
	public void restore(Momento state) {
		this.content=state.getContent();
	}

}
