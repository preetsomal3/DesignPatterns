package bdd.AdapterPattern;

public class AdaptorPatternDemo {

	public static void main(String[] args) {


		MediaPlayer mp = new AudioPlayer();
		
		mp.play("MP3", "sound.mp3");
		mp.play("MP4", "music.mp4");
		mp.play("VLC", "track.vlc");
	}

}
