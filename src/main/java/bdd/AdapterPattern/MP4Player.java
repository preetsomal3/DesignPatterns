package bdd.AdapterPattern;

public class MP4Player implements AdvancedMediaPlayer  {

		public void playVLC(String file) {
		System.out.println("Do Nothing");				
	}

		public void playMP4(String file) {
		System.out.println("Playing MP4 file named "+file);		
	}

}
