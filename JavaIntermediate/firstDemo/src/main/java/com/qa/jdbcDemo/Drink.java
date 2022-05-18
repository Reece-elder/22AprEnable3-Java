package com.qa.jdbcDemo;

public class Drink {
	
	// JDBC will be creating for us a Drinks table 
	// Primary Key - int
	// When inserting data into a database, MySQL will generate a primary key value for us
	// Auto Incrementing ID
	
	// Fields
	private int id;
	private String type;
	private String size; 
	private boolean dairyFree;
	private float cost;

	// Constructor - For pushing data into the database (no id)
	public Drink(String type, String size, boolean dairyFree, float cost) {
		super();
		this.type = type;
		this.size = size;
		this.dairyFree = dairyFree;
		this.cost = cost;
	}

	// Overloading - Multiple constructors (with different params) in one class 
	// Constructor - Getting data out of the database (has an id)
	public Drink(int id, String type, String size, boolean dairyFree, float cost) {
		super();
		this.id = id;
		this.type = type;
		this.size = size;
		this.dairyFree = dairyFree;
		this.cost = cost;
	}

	
	// Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isDairyFree() {
		return dairyFree;
	}

	public void setDairyFree(boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	// toString

	@Override
	public String toString() {
		return "Drink [id=" + id + ", type=" + type + ", size=" + size + ", dairyFree=" + dairyFree + ", cost=" + cost
				+ "]";
	}

}
