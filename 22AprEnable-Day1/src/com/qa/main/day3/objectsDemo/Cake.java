package com.qa.main.day3.objectsDemo;

public class Cake {
	
	// This class will contain the methods and details to construct a 'cake' object
	// vegan, layers, price, colour
	
	// Fields / Attributes, what details our cake includes
	// We are not specifying any of these values, because each cake object will specify themselves
	public boolean vegan;
	public int layers;
	public float price;
	public String colour;
	
	// Constructor - The method we run (from our main) to create a new 'cake'
	// Constructor methods don't have a name, and they return an object of the same type as the class
	// Not using static AND the method has no name 
	public Cake(boolean veganParam, int layersParam, float priceParam, String colourParam) {
		
		// this - referring to the object we are currently creating 
		this.vegan = veganParam;
		this.layers = layersParam;
		this.price = priceParam;
		this.colour = colourParam;
		
		// Creating and setting the values of our cake object
	}
	

}
