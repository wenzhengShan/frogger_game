package frogger.model;

import java.util.ArrayList;

import frogger.model.actor.movableActor.*;
import frogger.model.actor.staticActor.Chomper;
import frogger.model.actor.staticActor.Digit;
import frogger.model.actor.staticActor.End;
import javafx.scene.image.ImageView;

/**
 * <h2> Map </h2>
 * 
 * <p> The {@link Map} Class is used to contain all different types of {@link frogger.model.actor.Actor} objects and provide the method for outside classes 
 * to access or add these objects.
 * 
 * <p> <Strong> Use: </Strong>
 * 
 * <pre>
 * 		Map map = new Map();
 * 		map.getActor().add(.....);
 * </pre>
 * 
 * @author Wenzheng Shan
 * @version 1.0
 * @since 1.0
 * @see Log
 * @see Obstacle
 * @see Turtle
 * @see WetTurtle
 * @see End
 * @see Digit
 * @see ImageView
 * @see Frog
 * @see Snake
 * @see Chomper
 * @see frogger.view.GameView
 * @see frogger.service.MapReader
 * @see frogger.service.MapFactory
 * @see frogger.controller.GameController
 */
public class Map {
	
	/** The {@link Log} arraylist set in {@link Map} */
	private ArrayList<Log> logs;
	/** The {@link Obstacle} arraylist set in {@link Map} */
	private ArrayList<Obstacle> obstacles;
	/** The {@link Turtle} arraylist set in {@link Map} */
	private ArrayList<Turtle> turtles;
	/** The {@link WetTurtle} arraylist set in {@link Map} */
	private ArrayList<WetTurtle> wetTurtles;
	/** The {@link End} arraylist set in {@link Map} */
	private ArrayList<End> ends;
	/** The score board which contains three {@link Digit} set in {@link Map} */
	private ArrayList<Digit> scoreBoard;
	/** The {@link Snake} arraylist set in {@link Map} */
	private ArrayList<Snake> snakes;
	/** The {@link Chomper} arrayList set in {@link Map} */
	private ArrayList<Chomper> chompers;
	/** The life {@link ImageView} arraylist set in {@link Map} */
	private ArrayList<ImageView> lifeImage;
	/** The {@link Frog} set in {@link Map} */
	private Frog animal;
	
	/** <p>The constructor of {@link Map} class to generate instances.
	 * <p> Initialize each arraylist with the use of new operation.
	 */
	public Map() {
		logs = new ArrayList<Log>();
		obstacles = new ArrayList<Obstacle>();
		turtles = new ArrayList<Turtle>();
		wetTurtles = new ArrayList<WetTurtle>();
		ends = new ArrayList<End>();
		scoreBoard = new ArrayList<Digit>();
		lifeImage = new ArrayList<ImageView>();
		snakes = new ArrayList<Snake>();
		chompers = new ArrayList<Chomper>();
	}

	/**
	 * Returns the {@link Log} in this {@link Map}.
	 * 
	 * @return	the {@link Log} in this {@link Map}
	 */
	public ArrayList<Log> getLogs() {
		return logs;
	}

	/** 
	 * Returns the {@link Obstacle} in this {@link Map}. 
	 * 
	 * @return the {@link Obstacle} in this {@link Map}
	 */
	public ArrayList<Obstacle> getObstacles() {
		return obstacles;
	}

	/** 
	 * Returns the {@link Turtle} in this {@link Map}. 
	 * 
	 * @return the {@link Turtle} in this {@link Map}
	 */
	public ArrayList<Turtle> getTurtles() {
		return turtles;
	}

	/** 
	 * Returns the {@link WetTurtle} in this {@link Map}. 
	 * 
	 * @return the {@link WetTurtle} in this {@link Map}
	 */
	public ArrayList<WetTurtle> getWetTurtles() {
		return wetTurtles;
	}

	/** 
	 * Returns the {@link End} in this {@link Map}. 
	 * 
	 * @return the {@link End} in this {@link Map}
	 */
	public ArrayList<End> getEnds() {
		return ends;
	}

	/** 
	 * Returns the scoreBoard in this {@link Map}. 
	 * 
	 * @return the scoreBoard in this {@link Map}
	 */
	public ArrayList<Digit> getScoreBoard() {
		return scoreBoard;
	}

	/**
	 * Returns the {@link Snake} in this {@link Map}.
	 *
	 * @return the {@link Snake} in this {@link Map}
	 */
	public ArrayList<Snake> getSnakes() {return snakes;}

	/**
	 * Returns the {@link Chomper} in this {@link Map}.
	 *
	 * @return the {@link Chomper} in this {@link Map}
	 */
	public ArrayList<Chomper> getChompers() {return chompers;}

	/** 
	 * Returns the life image in this {@link Map}. 
	 * 
	 * @return the life image in this {@link Map}
	 */
	public ArrayList<ImageView> getLifeImage() {
		return lifeImage;
	}

	/** 
	 * Returns the {@link Frog} in this {@link Map}. 
	 * 
	 * @return the {@link Frog} in this {@link Map}
	 */
	public Frog getAnimal() {
		return animal;
	}
	
	/**
	 * Set the {@link #animal} by the given {@code animal}.
	 * 
	 * @param animal an {@link Frog} instance to be set to {@link #animal}
	 */
	public void setAnimal(Frog animal) {
		this.animal = animal;
	}
}

