package com.qa.main.day4.abstraction;

// Penguin class inherits bird
public class Penguin extends Bird {
	
	// Fields 
	private int swimSpeed;
	
	// Constructor - Right click > source > generate constructor using fields
	public Penguin(int wingspan, String featherColour, int swimSpeed) {
		super(wingspan, featherColour);
		this.swimSpeed = swimSpeed;
	}

	// Methods that were abstract, but we have to define
	
	// Useful for other devs to know this is updating an old method 
	@Override
	public String layEgg() {
		// TODO Auto-generated method stub
		return "laying a cold egg.. brrr..";
	}

	@Override
	public String eat(String diet) {
		return "Eating a cold plate of " + diet;
	}
	
	
	
	

}
