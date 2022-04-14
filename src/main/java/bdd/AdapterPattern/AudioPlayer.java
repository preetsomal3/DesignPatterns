package bdd.AdapterPattern;

public class AudioPlayer implements MediaPlayer  {
	
	private MediaAdapter mediaAdapter;

	public void play(String filetype, String filename) {

		if(filetype.equals("MP3")) {
			System.out.println("Playing MP3 filename "+filename);
		}
		else if(filetype.equals("VLC") || filetype.equals("MP4")) {
			mediaAdapter= new MediaAdapter(filetype);
			mediaAdapter.play(filetype, filename);
			
		}else {
			System.out.println("Unsupported File Format");
		}
		
	}

}
