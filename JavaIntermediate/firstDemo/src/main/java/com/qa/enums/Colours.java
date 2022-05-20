package com.qa.enums;

// enum - separate file type used to store a finite list of options
// They can store; strings, numbers, objects etc.
public enum Colours {
	
	// enums are created as upper case file types
	
	// These enums are essentially empty objects
	
	RED("#e5e5e5", "strawberry"),
	BLUE("#d1d1d1", "blueberries"),
	GREEN("#f7f7f7", "kiwi"),
	PURPLE("#b2b2b2", "plum"),
	YELLOW("#c4c4c4", "banana"),
	ORANGE("#a1a1a1", "carrot");
	
	// Make some fields and a constructor 
	private String hexCode;
	private String foodOfColour;
	
	// Constructor
	private Colours(String hexCode, String foodOfColour) {
		this.hexCode = hexCode;
		this.foodOfColour = foodOfColour;
	}
	
	public String colourHexCode() {
		return hexCode + " " + foodOfColour;
	}

	public String getHexCode() {
		return hexCode;
	}

	public void setHexCode(String hexCode) {
		this.hexCode = hexCode;
	}

	public String getFoodOfColour() {
		return foodOfColour;
	}

	public void setFoodOfColour(String foodOfColour) {
		this.foodOfColour = foodOfColour;
	}
	
	
	
	

}
