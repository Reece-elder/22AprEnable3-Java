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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((featherColour == null) ? 0 : featherColour.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + wingspan;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		if (featherColour == null) {
			if (other.featherColour != null)
				return false;
		} else if (!featherColour.equals(other.featherColour))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wingspan != other.wingspan)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", featherColour=" + featherColour + ", wingspan=" + wingspan + ", name=" + name
				+ "]";
	}
	
}
