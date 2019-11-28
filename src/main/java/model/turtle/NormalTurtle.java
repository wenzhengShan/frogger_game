package model.turtle;

import frogger.Main;
import javafx.scene.image.Image;

public class NormalTurtle extends Turtle{
	
	public NormalTurtle(int size, double  xpos, double  ypos, double  s) {
		super(xpos, ypos, s);
		this.getTurtleImages().add(new Image(Main.class.getResourceAsStream("images/TurtleAnimation2.png"), size, size, true, true));
		this.getTurtleImages().add(new Image(Main.class.getResourceAsStream("images/TurtleAnimation1.png"), size, size, true, true));
		this.getTurtleImages().add(new Image(Main.class.getResourceAsStream("images/TurtleAnimation3.png"), size, size, true, true));
		setImage(getTurtleImages().get(0));
	}

	@Override
	public void changeWetturtleImage(int index) {
		setImage(this.getTurtleImages().get(index));
	}
}
