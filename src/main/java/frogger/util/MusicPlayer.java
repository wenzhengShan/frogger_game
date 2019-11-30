package frogger.util;

import java.net.URL;

import frogger.Main;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public enum MusicPlayer{
	INSTANCE;
	
	private MediaPlayer mediaPlayer;
	
	public void init(String musicURL) {
		URL musicFile = Main.class.getResource(musicURL);
		Media sound = new Media(musicFile.toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	}
	
	public void playMusic() {
	    mediaPlayer.play();
	}
	
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
