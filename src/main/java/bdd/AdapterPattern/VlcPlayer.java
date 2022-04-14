package bdd.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer  {

	public void playVLC(String filename) {

		System.out.println("Playing VLC file named "+filename);		
	}

	public void playMP4(String filename) {
		System.out.println("Do Nothing");				
	}

}
