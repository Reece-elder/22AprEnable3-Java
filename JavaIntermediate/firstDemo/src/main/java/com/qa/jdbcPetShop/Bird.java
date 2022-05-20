package com.qa.jdbcPetShop;

public class Bird {
	
	// Fields
	private int id;
	private String featherColour;
	private int wingspan; 
	private String name;
	
	// Constructor WITH id - Pulling data from the database
	public Bird(int id, String featherColour, int wingspan, String name) {
		super();
		this.id = id;
		this.featherColour = featherColour;
		this.wingspan = wingspan;
		this.name = name;
	}

	// Constructor WITHOUT id - Posting data into the database
	public Bird(String featherColour, int wingspan, String name) {
		super();
		this.featherColour = featherColour;
		this.wingspan = wingspan;
		this.name = name;
	}
	
	// Methods
	public String makeNoise() {
		String noise = "Cacaw! My name is " + getName();
		return noise;
	}

	
	// Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeatherColour() {
		return featherColour;
	}

	public void setFeatherColour(String featherColour) {
		this.featherColour = featherColour;
	}

	public int getWingspan() {
		return wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Hash Code and Equals overwrite the existing methods, and let us compare values more easily 
	


	@Override
	public String toString() {
		return "Bird [id=" + id + ", featherColour=" + featherColour + ", wingspan=" + wingspan + ", name=" + name
				+ "]";
	}
	
}
