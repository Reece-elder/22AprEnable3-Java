package com.qa.main.day4.abstraction;

// Bird is going to be our abstract class, meaning we can't directly create an object of it 
public abstract class Bird {
	
	// Fields
	private int wingspan; 
	private String featherColour;
	
	// Constructor 
	public Bird(int wingspan, String featherColour) {
		super();
		this.wingspan = wingspan;
		this.featherColour = featherColour;
	}
	
	// Methods - Abstract classes can use abstract methods
	// abstract methods have no body {} so the children can make the method do whatever they want 
	// the main benefit of abstract methods is all children have a method with the same 
	// name that returns the same data
	
	// Method that returns the balance in my account after checking my pin 
	// what would you call this method and what data type does it take in 
	
	// Abstract method for layEgg() all children of this class must define what this method does
	public abstract String layEgg();
	
	public abstract String eat(String diet);

	
	// Getters and Setters
	
	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public String getFeatherColour() {
		return featherColour;
	}

	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}
	
	

}
