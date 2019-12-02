package frogger;

import frogger.util.MusicPlayer;
import frogger.util.SceneSwitch;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage){
		MusicPlayer.INSTANCE.init();
		SceneSwitch.INSTANCE.init(primaryStage);
		
		primaryStage.setTitle("Frogger Game");
		primaryStage.setResizable(false);
		
		SceneSwitch.INSTANCE.switchToStartScreen();
	}
}
