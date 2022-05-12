package com.qa.main.day4.inheritence;

//Inherit the attributes and Methods from its parent class (Bird) 
// Penguin extends <parent class>

// If a penguin is inheriting Bird values (feather colour, wingspan, diet) 
// You need a constructor that takes in (feather colour, wingspan and diet)
public class Penguin extends Bird {
	
	// Inherit the attributes and Methods from its parent class (Bird) 
	
	// Fields
	private int fishEaten; 
	
	// Methods
	public String swim() {
		return "Just keep swimmmmmingggg";
	}

	// Constructor that takes in the Bird values + penguin values
	public Penguin(String featherColour, String diet, int wingspan, int fishEaten) {
		// super() - referring to the parent class (Bird)
		super(featherColour, diet, wingspan);
		this.fishEaten = fishEaten;
	}

	public int getFishEaten() {
		return fishEaten;
	}

	public void setFishEaten(int fishEaten) {
		this.fishEaten = fishEaten;
	}
	
	
	


}
