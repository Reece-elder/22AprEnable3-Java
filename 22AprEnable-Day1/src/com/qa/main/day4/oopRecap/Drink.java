package com.qa.main.day4.oopRecap;

// This class will be used to create drinks for our cafe
public class Drink {
	
	// Our drink methods and variables are not static (isntanced)
	
	// variables for our attributes 
	public String type;
	public float cost;
	public boolean dairyFree;
	public int calories;
	
	// Static variable - This is the same across ALL OBJECTS OF THIS CLASS 
	// This variable doesn't go into the constructor as it already has a value
	public static String cupColour = "white";

	
	// Constructor - Method to create our object
	// Shift + alt + s OR right click > source > generate constructor using fields
	// Always make constructors etc. automatically to save time, and make it more accurate

	public Drink(String type, float cost, boolean dairyFree, int calories) {
		super(); // super() -> Telling java we want to create this in the default way
		this.type = type;
		this.cost = cost;
		this.dairyFree = dairyFree;
		this.calories = calories;
	}
	
	// toString - When we system out, gives us the values rather than the id reference @id6829bc36
	// Shift + alt + s OR right click > source > generate constructor using fields
	
	@Override
	public String toString() {
		return "Drink [type=" + type + ", cost=" + cost + ", dairyFree=" + dairyFree + ", calories=" + calories + "]";
	} 
	
}
