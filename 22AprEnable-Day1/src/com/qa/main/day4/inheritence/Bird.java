package com.qa.main.day4.inheritence;

public class Bird {
	
	// Fields
	private String featherColour;
	private String diet; 
	private int wingspan; 
	
	// Basic Methods birds can do
	public String layEgg() {
		return "Laying an egg";
	}
	
	public String walk() {
		return "Walking around..";
	}

	// Constructor
	public Bird(String featherColour, String diet, int wingspan) {
		super(); // Use the default Object.class object 
		this.featherColour = featherColour;
		this.diet = diet;
		this.wingspan = wingspan;
	}
	
	// Getters and Setters

	public String getFeatherColour() {
		return featherColour;
	}

	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}
	
	
	
	

}
