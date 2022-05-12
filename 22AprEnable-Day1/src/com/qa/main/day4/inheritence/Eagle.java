package com.qa.main.day4.inheritence;

// Eagle class to inherit Bird
public class Eagle extends Bird  {
	
	// Fields - 
	private int eyesight; 
	
	// Method 
	public String screech() {
		return "CACAW";
	}

	// Constructor which uses the Bird constructor as well 
	public Eagle(String featherColour, String diet, int wingspan, int eyesight) {
		super(featherColour, diet, wingspan);
		this.eyesight = eyesight;
	}
	
	// Getters and Setters

	public int getEyesight() {
		return eyesight;
	}

	public void setEyesight(int eyesight) {
		this.eyesight = eyesight;
	}
}
