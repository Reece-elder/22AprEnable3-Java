package com.qa.main.day4.abstraction;

// Ostrich is a child of our abstract class Bird 
public class Ostrich extends Bird {
	
	// Field 
	private float landSpeed;

	// Constructor
	public Ostrich(int wingspan, String featherColour, float landSpeed) {
		super(wingspan, featherColour);
		this.landSpeed = landSpeed;
	}
	
	// Our Ostrich is inheriting 2 abstract classes ( eat(), layEgg() ) 

	@Override
	public String layEgg() {
		return "Laying a big ostrich egg..";
	}
	
	@Override
	public String eat(String diet) {
		return "Eating a plate of " + diet;
	}

}
