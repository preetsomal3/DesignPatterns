package bdd.AdapterPattern;

public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer amp;
		
	MediaAdapter(String filetype){
		
		if(filetype.equals("VLC")) {
			
			amp = new VlcPlayer();
		}else if(filetype.equals("MP4")) {
			
			amp = new MP4Player();
		}
		
	}
	public void play(String filetype, String filename) {
		
		if(filetype.equals("VLC")) {
			amp.playVLC(filename);
		}else if(filetype.equals("MP4")) {
			
			amp.playMP4(filename);
		}
		
	}

}
